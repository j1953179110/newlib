package com.example.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.demo.R;
import com.example.demo.base.BaseActivity;
import com.example.demo.base.BasePresenter;
import com.example.demo.bean.NewListBean;
import com.example.demo.interfaces.MainContract;
import com.example.demo.presenter.MainPresenterImpl;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {

    @Override
    protected void initData() {
        presenter.getData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected MainPresenterImpl createPresenter() {
        return new MainPresenterImpl();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void getDataReturn(NewListBean newListBean) {
        if(newListBean != null){
            Log.d("TAG","请求成功");
        }else{
            Log.d("TAG","请求失败");

        }
    }
}