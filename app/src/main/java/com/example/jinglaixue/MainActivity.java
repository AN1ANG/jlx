package com.example.jinglaixue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化方法
        initUI();
    }

    private void initUI() {
        findViewById(R.id.btn1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                //跳转界面
                Intent intent =new Intent();
                intent.setClass(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}


