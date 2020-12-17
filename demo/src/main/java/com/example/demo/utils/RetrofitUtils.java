package com.example.demo.utils;

import com.example.demo.api.ApiService;
import com.example.demo.api.URLContract;

import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitUtils {

    public static RetrofitUtils instance;

    public static RetrofitUtils getInstance() {
        if (instance == null) {
            synchronized (RetrofitUtils.class) {
                if (instance == null) {
                    instance = new RetrofitUtils();
                }
            }
        }
        return instance;
    }

    private ApiService apiService;

    public RetrofitUtils() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLContract.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();


        apiService = retrofit.create(ApiService.class);
    }


}
