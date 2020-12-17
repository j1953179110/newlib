package com.example.a1217test.model;

import com.example.a1217test.interfaces.ICallBack;
import com.example.a1217test.interfaces.MainContract;
import com.example.a1217test.utils.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {

    private MainContract.IMainPresenter presenter;

    public MainModelImpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getData(String url, ICallBack<T> iCallBack) {
        RetrofitUtils.getInstance().get(url, iCallBack);
    }
}
