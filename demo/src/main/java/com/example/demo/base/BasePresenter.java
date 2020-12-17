package com.example.demo.base;

public class BasePresenter<V extends BaseView> {
    public V iView;

    public void AttchView(V v) {
        iView = v;
    }
}
