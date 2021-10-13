package com.example.testapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testapplication.SecondRecycler.SecondMainActivity;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestRecycleView extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressDialog progressDialog;
    EditText et1;
    TextView tt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);

        recyclerView = findViewById(R.id.r_test);
        et1 = findViewById(R.id.edit1);
        tt1 = findViewById(R.id.text1);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 12){
            if (resultCode == 50){
                String sss = data.getStringExtra("Final").toString();
                tt1.setText(sss);
            }
        }
    }

    static public void addResult(int add){
    }

    public void btnClick(View v){

        String s = et1.getText().toString();

        Intent intent = new Intent(TestRecycleView.this,SecondMainActivity.class);
        intent.putExtra("Val", s);
        startActivityForResult(intent,12);

//        progressDialog = new ProgressDialog(this);
//        progressDialog.setTitle("Loading .. .. ..");
//        progressDialog.setCancelable(false);
//        progressDialog.show();
//
//
//        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60,TimeUnit.SECONDS).writeTimeout(60,TimeUnit.SECONDS).build();
//
//        Retrofit retrofit = new Retrofit.Builder().client(okHttpClient)
//                .baseUrl("http://retailerapp.sundirect.in/retailerapi/s@dsithuikr9584785ghdjh.asmx/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        ApiServices apiServices = retrofit.create(ApiServices.class);
//
//
//        Call<Pojo> pojoCall = apiServices.getList("2","2021-10-11","2021-10-11","","");
//
//        pojoCall.enqueue(new Callback<Pojo>() {
//            @Override
//            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
//
//                if (response.isSuccessful()){
//
//                    progressDialog.dismiss();
//                    if (response.body().getResponse().equalsIgnoreCase("Success")){
//
//
//                        if (response.body().getData().size() > 0){
//
//                            recyclerView.setAdapter(null);
//
//                            RecyclerAdapter adapter = new RecyclerAdapter(TestRecycleView.this,response.body().getData());
//                            recyclerView.setAdapter(adapter);
//                        }
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Pojo> call, Throwable t) {
//
//            }
//        });




    }
}