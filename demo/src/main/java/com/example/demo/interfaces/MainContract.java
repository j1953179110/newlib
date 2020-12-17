package com.example.demo.interfaces;

import com.example.demo.base.BaseView;
import com.example.demo.bean.NewListBean;

public class MainContract {
    public interface IMainView extends BaseView {
        void getDataReturn(NewListBean newListBean);
    }

    public interface IMainPresenter {
        void getData();
    }

    public interface IMainModel {
        <T> void getData(String url, ICallBack<T> iCallBack);
    }
}
