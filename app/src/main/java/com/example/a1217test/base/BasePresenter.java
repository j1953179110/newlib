package com.example.a1217test.base;

public class BasePresenter<V extends BaseView> {
    public V iView;

    public void AttchView(V v) {
        iView = v;
    }
}
