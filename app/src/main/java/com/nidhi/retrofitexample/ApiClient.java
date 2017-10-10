package com.nidhi.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nidhi on 8/24/2017.
 */

public class ApiClient {
    public static Retrofit retrofit = null;
    public static final String BASE_URL = "https://wise.strose.edu";
    //public static final String BASE_URL = "https://androidtutorialpoint.com/api/RetrofitAndroidObjectResponse";

    public static Retrofit getApiClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;

        //returns instance of retrofit

    }





}
