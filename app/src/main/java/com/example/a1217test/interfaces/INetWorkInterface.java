package com.example.a1217test.interfaces;

import com.example.a1217test.interfaces.ICallBack;

public
interface INetWorkInterface {
    public <T> void get(String url, ICallBack<T> iCallBack);
}
