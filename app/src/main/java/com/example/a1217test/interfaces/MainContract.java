package com.example.a1217test.interfaces;

import com.example.a1217test.base.BaseView;
import com.example.a1217test.bean.NewListBean;

public class MainContract {
    public interface IMainView extends BaseView {
        void getDataReturn(NewListBean news);
    }

    public interface IMainPresenter {
        void getData(String user,String pwd);
    }

    public interface IMainModel {
        <T> void getData(String url, ICallBack<T> iCallBack);
    }
}
