package com.ivan.scanandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.ivan.scanandroid.model.BillModel;
import com.ivan.scanandroid.model.NomalModel;
import com.ivan.scanandroid.util.HttpUtil;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import java.util.HashMap;

public class MainActivity extends Activity {
    /**
     * 扫描跳转Activity RequestCode
     */
    public static final int REQUEST_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    void btnConfirm_Click(View view) {

        Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
//        Toast.makeText(this,"点我验证",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onActivityResult(
            int requestCode, int resultCode, Intent data) {
        /**
         * 处理二维码扫描结果
         */
        if (requestCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE)
                        == CodeUtils.RESULT_SUCCESS) {
                    String result =
                            bundle.getString(CodeUtils.RESULT_STRING);
//                    //用默认浏览器打开扫描得到的地址
//                    Intent intent = new Intent();
//                    intent.setAction("android.intent.action.VIEW");
//                    Uri content_url = Uri.parse(result.toString());
//                    intent.setData(content_url);
//                    startActivity(intent);

//                    Toast.makeText(MainActivity.this, result
//                            , Toast.LENGTH_LONG).show();


                    HttpUtil hutil = new HttpUtil();
                    HashMap<String, String> map = new HashMap();

                    map.put("BillNo", result);
                    hutil.requestAsyn("BillVerification", HttpUtil.TYPE_GET, map, new HttpUtil.ReqCallBack<Object>() {
                        @Override
                        public void onReqSuccess(Object result) {
                            Gson gson = new Gson();
                            NomalModel model = gson.fromJson(result.toString(), NomalModel.class);
                            if (model.getResultStatus().equals("Success")) {
                                Log.d("onReqSuccess", "Success");
                                BillModel tempmodel = gson.fromJson(result.toString(), BillModel.class);

                            }else
                            {
                                Toast.makeText(MainActivity.this, model.getResult(), Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onReqFailed(String errorMsg) {

                        }
                    });
                    Intent intent = new Intent(MainActivity.this, PrintActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE)
                        == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(MainActivity.this,
                            "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
