package com.example.harryapp;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class authInterceptor implements Interceptor {
    private String mAuthToken;

    public authInterceptor(String authToken) {
        mAuthToken = authToken;
    }

    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request  = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer " + mAuthToken)
                .build();
        return chain.proceed(request);
    }
}