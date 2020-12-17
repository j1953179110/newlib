package com.example.demo.interfaces;

public interface ICallBack<T> {
    void onsuccess(T t);

    void onfail(String error);
}
