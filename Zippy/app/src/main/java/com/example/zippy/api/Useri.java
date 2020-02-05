package com.example.zippy.api;

import com.example.zippy.model.User;
import com.example.zippy.serverresponse.ImageResponse;
import com.example.zippy.serverresponse.UserResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface Useri {

    @POST("user/register")
    Call<Void> addUser(@Body User user);

    @FormUrlEncoded
    @POST("user/login")
    Call<UserResponse> login(@Field("username") String username, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

    @GET("user/retriveme")
    Call<User> getme(@Header("Authorization") String token);

    @PUT("user/updateme")
    Call<User> updateProfile(@Header("Authorization") String token, @Body User user);
}
