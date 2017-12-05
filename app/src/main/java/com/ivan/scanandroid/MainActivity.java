package com.ivan.scanandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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



        Intent intent = new Intent(MainActivity.this, ScanActivity.class);
        startActivity(intent);
//        Toast.makeText(this,"点我验证",Toast.LENGTH_LONG).show();
    }


}
