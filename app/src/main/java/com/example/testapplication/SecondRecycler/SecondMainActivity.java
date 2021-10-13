package com.example.testapplication.SecondRecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.testapplication.R;
import com.example.testapplication.TestRecycleView;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondMainActivity extends AppCompatActivity {

    Button btn;
    RecyclerView recyclerView;
    ProgressDialog mProgressDialog;
    EditText edit1;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        btn = findViewById(R.id.testBtn);
        recyclerView = findViewById(R.id.second_recy_view);
        edit1 = findViewById(R.id.edit_sec);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        Intent intent = getIntent();
        s = intent.getStringExtra("Val");

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getTransList("Nation","Population");
                String s1 = edit1.getText().toString();

                int add = Integer.valueOf(s1) + Integer.valueOf(s);

                TestRecycleView.addResult(add);

                Intent intent1 = new Intent();
                intent1.putExtra("Final",String.valueOf(add));
                setResult(50,intent1);
                finish();

            }
        });
    }

    private void getTransList(String country, String popup) {
        mProgressDialog = new ProgressDialog(SecondMainActivity.this);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setTitle("Loading .. Please wait");
        mProgressDialog.show();

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60,TimeUnit.SECONDS).readTimeout(60,TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://datausa.io/api/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiCall apiCall = retrofit.create(ApiCall.class);

//        DataModel dataModel = new DataModel(country,popup);

        Call<SecondPojo> secondPojoCall = apiCall.getTransHist(country,popup);

        secondPojoCall.enqueue(new Callback<SecondPojo>() {
            @Override
            public void onResponse(Call<SecondPojo> call, Response<SecondPojo> response) {
                if (response.isSuccessful()){
                    mProgressDialog.dismiss();

                        if (response.body().getSource().size()>0){
                            recyclerView.setAdapter(null);

                            SecondAdapter secondAdapter = new SecondAdapter(SecondMainActivity.this,response.body().getSource());
                            recyclerView.setAdapter(secondAdapter);
                        }

                }
            }

            @Override
            public void onFailure(Call<SecondPojo> call, Throwable t) {
                mProgressDialog.dismiss();
                Toast.makeText(SecondMainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();


            }
        });


    }
}