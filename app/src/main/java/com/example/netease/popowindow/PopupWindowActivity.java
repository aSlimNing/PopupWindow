package com.example.netease.popowindow;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PopupWindowActivity extends Activity implements CommonPopupWindow.ViewInterface {

    private Button mPopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mPopBtn = (Button) findViewById(R.id.btn_popup);
        CommonPopupWindow.Builder mPopWindowBuilder = new CommonPopupWindow.Builder(this);
        mPopWindowBuilder.setView(R.layout.popup_down).setAnimationStyle(R.style.AnimHorizontal).setBackGroundLevel(0.5f).setViewOnclickListener(this)
    }

    @Override
    public void getChildView(View view, int layoutResId) {

    }
}
