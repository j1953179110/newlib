package com.example.demo.presenter;

import com.example.demo.api.URLContract;
import com.example.demo.base.BasePresenter;
import com.example.demo.bean.NewListBean;
import com.example.demo.interfaces.ICallBack;
import com.example.demo.interfaces.MainContract;
import com.example.demo.model.MainModelImpl;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {

    private MainContract.IMainModel model;

    public MainPresenterImpl() {
        this.model = new MainModelImpl();
    }

    @Override
    public void getData() {
        model.getData(URLContract.NEWLIST, new ICallBack<NewListBean>() {
            @Override
            public void onsuccess(NewListBean newListBean) {
                iView.getDataReturn(newListBean);
            }

            @Override
            public void onfail(String error) {

            }
        });
    }
}
