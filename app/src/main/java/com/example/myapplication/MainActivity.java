package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.happy_api.IHappyApi;
import com.example.modulizationsubprojecta.CommonTextView;
import com.example.modulizationsubprojecta.ToastUtil;
import com.ss.android.ugc.base.ServiceManager;
import com.ss.android.ugc.enterprise_api.IEnterpriseApi;
import com.ss.android.ugc.poi_api.IPoiApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.init_enterprise).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceManager.INSTANCE.getService(IEnterpriseApi.class).init();
            }
        });
        findViewById(R.id.init_poi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceManager.INSTANCE.getService(IPoiApi.class).init();
            }
        });
        findViewById(R.id.init_happy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceManager.INSTANCE.getService(IHappyApi.class).haveFunTogether();
            }
        });
        findViewById(R.id.init_common_ui).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonTextView textView = new CommonTextView(MainActivity.this);
                textView.setText("test");
            }
        });
        findViewById(R.id.init_common_util).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.showToast(MainActivity.this, "hello, I'm using common util");
            }
        });
    }
}
