package com.example.demo.utils;

import com.example.demo.interfaces.ICallBack;

public interface INetWorkInterface {
    public <T> void get(String url, ICallBack<T> iCallBack);
}
