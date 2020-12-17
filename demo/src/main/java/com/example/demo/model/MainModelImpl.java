package com.example.demo.model;

import com.example.demo.interfaces.ICallBack;
import com.example.demo.interfaces.MainContract;
import com.example.demo.utils.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {

//    private MainContract.IMainPresenter presenter;
//
//    public MainModelImpl(MainContract.IMainPresenter presenter) {
//        this.presenter = presenter;
//    }

    @Override
    public <T> void getData(String url, ICallBack<T> iCallBack) {
        RetrofitUtils.getInstance().get(url, iCallBack);
    }
}
