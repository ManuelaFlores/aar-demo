package com.example.seconddemosdkaar;

import okhttp3.OkHttpClient;

public class WorkingOnOkhttp {

    public String getOkHttpClient() {
        return new OkHttpClient().toString();
    }

    public String getBuilder() {
        return new OkHttpClient.Builder().toString();
    }

}
