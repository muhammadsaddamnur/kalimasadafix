package com.saddam.nur.kalimasadafix;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by acer on 3/12/2018.
 */


public interface ApiServicePost {
    @FormUrlEncoded
    @POST("daftar.php")
    Call<PostResponseModel> InsertPost(@Field("nama") String nama, @Field("email") String email, @Field("password") String password, @Field("no_hp") String no_hp, @Field("alamat") String alamat, @Field("bank") String bank, @Field("no_rek") String no_rek, @Field("atasnama") String atasnama);

}
