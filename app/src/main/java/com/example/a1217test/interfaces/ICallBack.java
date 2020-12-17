package com.example.a1217test.interfaces;

public interface ICallBack<T> {
    void onsuccess(T t);

    void onfail(String str);
}
