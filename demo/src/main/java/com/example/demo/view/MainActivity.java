package com.example.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.R;
import com.example.demo.base.BaseActivity;
import com.example.demo.base.BasePresenter;
import com.example.demo.bean.NewListBean;
import com.example.demo.interfaces.MainContract;

public class MainActivity extends BaseActivity implements MainContract.IMainView {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void getDataReturn(NewListBean newListBean) {

    }
}