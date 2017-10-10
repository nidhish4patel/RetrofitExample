package com.nidhi.retrofitexample;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by nidhi on 8/24/2017.
 */

public interface ApiInterface {

    @GET("/rest/public/AllDirectoryEntries/json")
    Call<List<Student>> getdata();


}
