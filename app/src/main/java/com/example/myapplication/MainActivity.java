 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Api_interface.Jsonplaceholder;
import com.example.myapplication.Models.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult=findViewById(R.id.text);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Jsonplaceholder jsonplaaceholder = retrofit.create(Jsonplaceholder.class);
        Call<List<Posts>> call = jsonplaaceholder.getsposts();
        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                {
                    if (!response.isSuccessful());
                    {
                        textViewResult.setText("Code"  +response.code());
                    }
                }
                List<Posts> posts= response.body();
                for (Posts post:posts) {
                    String content = "";

                    content += "Title: " + post.getJobsTitle() + "\n";
                    content +="Salary: " + post.getSalary() + "\n";
                    content += "Detail: " + post.getDetails() + "\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Arjun", Toast.LENGTH_SHORT).show();
                textViewResult.setText((t.getMessage()));

            }
        });
    }
}