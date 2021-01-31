package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import com.ss.android.ugc.base.ServiceManager;
import com.ss.android.ugc.enterprise_api.IEnterpriseApi;
import com.ss.android.ugc.poi_api.IPoiApi;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.init_enterprise).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                ServiceManager.INSTANCE.getService(IEnterpriseApi.class).init();
            }
        });
        findViewById(R.id.init_poi).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                ServiceManager.INSTANCE.getService(IPoiApi.class).init();
            }
        });
    }
}
