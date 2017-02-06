package com.soeasytest.app.backgroundprogress;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void btn1(View view){
        startActivity(new Intent(this,BpNoTxt_Activity.class));
    }

    public void btn2(View view){
        startActivity(new Intent(this,BpTxt_Activity.class));
    }

    public void btn3(View view){
        startActivity(new Intent(this,BpNoGradient_Activity.class));
    }
}
