package com.example.a1217test.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a1217test.R;
import com.example.a1217test.base.BaseActivity;
import com.example.a1217test.base.BasePresenter;
import com.example.a1217test.bean.NewListBean;
import com.example.a1217test.interfaces.MainContract;
import com.example.a1217test.presenter.MainPresenterIMpl;

public class MainActivity extends BaseActivity implements MainContract.IMainView {

    private android.widget.EditText etUser;
    private android.widget.EditText etPwd;
    private android.widget.Button btnLogin;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        etUser = (EditText) findViewById(R.id.et_user);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etUser.getText().toString()) && TextUtils.isEmpty(etPwd.getText().toString())) {
                    presenter.getData(etUser.getText().toString(),etPwd.getText().toString());
                }
            }
        });
    }

    @Override
    protected BasePresenter createPresenter() {
        return new MainPresenterIMpl(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void getDataReturn(NewListBean news) {
        if (news != null) {
            Log.d("TAG", "请求成功");
            String tile = news.getNews().get(0).getTile();
            Log.d("TAG", tile);

        } else {
            Log.d("TAG", "请求失败");

        }
    }
}