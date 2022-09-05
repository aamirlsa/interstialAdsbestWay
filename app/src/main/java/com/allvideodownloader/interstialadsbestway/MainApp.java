package com.allvideodownloader.interstialadsbestway;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.allvideodownloader.interstialadsbestway.ads.Admob;

public class MainApp extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Admob.loadInter(MainApp.this);


    }
}

