package com.example.testapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiServices {

    @FormUrlEncoded
    @POST("Get_DealerWise_DayBook")
    Call<Pojo> getList (@Field("RID") String rid, @Field("Fdate") String fdate, @Field("Tdate") String tdate, @Field("Type") String type, @Field("Mode") String mode);

}
