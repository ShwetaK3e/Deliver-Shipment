package com.shwetak3e.deliveryapp;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.shwetak3e.deliveryapp.utilities.Constants;
import com.shwetak3e.deliveryapp.utilities.UtilityFunc;

import java.util.LinkedList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    private static final int REQUEST_MULTIPLE_PERMISSION_CODE = 0;
    int SPLASH_SCREEN_TIME=3000;
    List<String> permissions=new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        configure();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 Intent i=new Intent(SplashActivity.this,MainActivity.class);
                 startActivity(i);
            }
        },SPLASH_SCREEN_TIME);


    }

    void configure(){
        maintainPermissions();
        UtilityFunc.setStringfromSharedPreference(getBaseContext(),Constants.BRANCH_ID,"1234");
    }


    void maintainPermissions() {
       if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
           permissions.add(Manifest.permission.CALL_PHONE);
       }
       if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)!=PackageManager.PERMISSION_GRANTED){
           permissions.add(Manifest.permission.READ_PHONE_STATE);
       }

       if(permissions.size()!=0){
           ActivityCompat.requestPermissions(this,permissions.toArray(new String[permissions.size()]),REQUEST_MULTIPLE_PERMISSION_CODE );
       }
    }



}
