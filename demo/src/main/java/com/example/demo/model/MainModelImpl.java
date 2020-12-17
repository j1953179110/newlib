package com.example.demo.model;

import com.example.demo.interfaces.ICallBack;
import com.example.demo.interfaces.MainContract;
import com.example.demo.utils.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {

    @Override
    public <T> void getData(String url, ICallBack<T> iCallBack) {
        RetrofitUtils.instance.get(url, iCallBack);
    }
}
