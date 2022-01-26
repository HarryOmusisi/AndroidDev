package com.example.harryapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccessToken {
    @SerializedName("famc29dW8YDEqsGN7rKPRXJZfT7o")
    @Expose
    public String accessToken;
    @SerializedName("3599")
    @Expose
    private String expiresIn;

    public AccessToken(String accessToken, String expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }
}

