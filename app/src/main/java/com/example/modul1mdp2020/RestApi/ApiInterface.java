package com.example.modul1mdp2020.RestApi;

import com.example.modul1mdp2020.Model.ListUserResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/users?page=2")
    Call<ListUserResponse> getList();

}
