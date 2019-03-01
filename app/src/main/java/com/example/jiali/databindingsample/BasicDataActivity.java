package com.example.jiali.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jiali.databindingsample.databinding.BasicDataActivityBinding;

public class BasicDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BasicDataActivityBinding basicDataActivityBinding = DataBindingUtil.setContentView(this, R.layout.basic_data_activity);
        basicDataActivityBinding.setName("JIM");
        basicDataActivityBinding.setAge(22);
    }
}
