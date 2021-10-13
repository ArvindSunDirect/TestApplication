package com.example.testapplication.SecondRecycler;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiCall {


    @GET("data")
    Call<SecondPojo> getTransHist(@Query("drilldowns") String count,@Query("measures") String pop);
}
