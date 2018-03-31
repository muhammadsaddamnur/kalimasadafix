package com.saddam.nur.kalimasadafix;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by acer on 3/12/2018.
 */


public class ApiClient {
    public static final String URL = "http://10.0.3.2/api_kalimasada/";
    public static Retrofit RETROFIT = null;

    public static Retrofit getClient() {
        if (RETROFIT == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new LoggingInterceptors())
                    .build();
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }
        return RETROFIT;
    }
}

