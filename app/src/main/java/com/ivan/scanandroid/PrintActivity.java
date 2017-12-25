package com.ivan.scanandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ivan.scanandroid.model.BillModel;
import com.ivan.scanandroid.util.DateUtil;
import com.ivan.scanandroid.util.PrintModel;
import com.ivan.scanandroid.util.PrintUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintActivity extends Activity {


    TextView tvPrintContent;
    List<PrintModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        tvPrintContent = findViewById(R.id.tvPrintContent);
        initView();
    }
    public static String dateToString(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyy-MM-dd");
        String ctime = formatter.format(time);

        return ctime;
    }


    void initView() {
        Intent intent = getIntent();
        //从Intent当中根据key取得value
        if (intent != null) {
            BillModel.JsonResult model = (BillModel.JsonResult) intent.getSerializableExtra("result");
            // Toast.makeText(PrintActivity.this, model.getBillCode(), Toast.LENGTH_LONG).show();
            list = new ArrayList<PrintModel>();


          //  list.add(new PrintModel("签到券", 40, true, false, true));
            list.add(new PrintModel("车牌：" + model.getCar_ID(), 30, false, false, false));
            list.add(new PrintModel("预约时间："+dateToString(model.getdReservationDay()), 30, false, false, false));
            list.add(new PrintModel("" + model.getDStartTime() + "-" + model.getDEndTime(), 30, false, false, false));
            list.add(new PrintModel("预约人数：" + model.getNum() + "人", 30, false, false, false));
            list.add(new PrintModel("预交款：" + model.getITotalMon(), 30, false, false, false));
            list.add(new PrintModel("预约人信息：" + model.getUser_Name(), 30, false, false, false));
            list.add(new PrintModel("联系电话：" + model.getContactPhone(), 30, false, false, false));
            list.add(new PrintModel("驾校：" + model.getDrivSch_Name(), 30, false, false, false));
            list.add(new PrintModel("教练：" + model.getCoachUserName(), 30, false, false, false));
            list.add(new PrintModel("签到时间：" + DateUtil.getTime(), 30, false, false, false));

            StringBuilder sb = new StringBuilder();
            for (PrintModel model1 : list) {
                sb.append(model1.getContent() + "\n\r");
            }
            tvPrintContent.setText(sb.toString());
            tvPrintContent.setTextSize(30);
        }
    }

    void btnPrint_Click(View view) {
        PrintUtil.PrintList("签到券",list);
        AlertDialog alertDialog = new AlertDialog.Builder(PrintActivity.this)
                .setTitle("提示")
                .setMessage("签到券打印完成，是否继续打印发票凭证")
                .setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        PrintUtil.PrintList("发票凭证",list);
                    }
                }).setNegativeButton("否", null).show();

    }


}
