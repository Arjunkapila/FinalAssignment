package com.example.myapplication.Api_interface;

import com.example.myapplication.Models.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Jsonplaceholder {

    @GET("/jobs")
    Call<List<Posts>>getsposts();


}
