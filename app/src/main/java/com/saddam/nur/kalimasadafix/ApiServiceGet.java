package com.saddam.nur.kalimasadafix;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by acer on 3/31/2018.
 */

public interface ApiServiceGet {

    @GET("login.php")
    Call<ListUserLoginModel> getUser(@Header("Authorization") String authHeader);

}
