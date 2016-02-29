package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import com.ab.activity.AbActivity;
import com.ab.view.titlebar.AbTitleBar;
public class MainActivity extends AbActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAbContentView(R.layout.activity_main);
        AbTitleBar mAbTitleBar = this.getTitleBar();
        mAbTitleBar.setTitleText("测试标题");
        mAbTitleBar.setTitleBarGravity(Gravity.CENTER,Gravity.CENTER);
        mAbTitleBar.setTitleBarBackgroundColor(Color.BLACK);
        System.out.println("测试");
        System.out.println("测试222");
    }
}