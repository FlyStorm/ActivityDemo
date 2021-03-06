package com.activitydemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.activitydemo.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    //声明控件
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    //设置监听
    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    //初始化控件
    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, LifeActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, ModelActivity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, AActivity.class));
                break;
            default:
                break;
        }

    }
}
