package com.example.a1217test.presenter;

import com.example.a1217test.base.BasePresenter;
import com.example.a1217test.base.BaseView;
import com.example.a1217test.bean.NewListBean;
import com.example.a1217test.interfaces.ICallBack;
import com.example.a1217test.interfaces.MainContract;
import com.example.a1217test.interfaces.URLContract;
import com.example.a1217test.model.MainModelImpl;

public class MainPresenterIMpl extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {

    private MainContract.IMainModel mainModel;

    public MainPresenterIMpl(MainContract.IMainView view) {
        this.mainModel = new MainModelImpl(this);
    }

    @Override
    public void getData(String user, String pwd) {
        mainModel.getData(URLContract.NEWLIST, new ICallBack<NewListBean>() {
            @Override
            public void onsuccess(NewListBean newListBean) {
                iView.getDataReturn(newListBean);
            }


            @Override
            public void onfail(String str) {

            }
        });
    }
}
