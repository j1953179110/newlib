package com.example.demo.api;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {

    @GET
    Observable<ResponseBody> getnewlist(@Url String url);
}
