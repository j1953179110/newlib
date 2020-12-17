package com.example.a1217test.interfaces;

import com.example.a1217test.bean.NewListBean;

public class MainContract {
    public interface IMainView {
        void getDataReturn(NewListBean news);
    }

    public interface IMainPresenter {
        void getData();
    }

    public interface IMainModel {
        <T> void getData(String url, ICallBack<T> iCallBack);
    }
}
