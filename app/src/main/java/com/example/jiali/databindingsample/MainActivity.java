package com.example.jiali.databindingsample;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.jiali.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("TOM", 11);
        binding.setUser(user);
        binding.setClickListener(this);
        OnClickHandler onClickHandler = new OnClickHandler(this);
        binding.setHandlerClick(onClickHandler);
    }

    private void onButton1Click() {
        Intent intent = new Intent(this, BasicDataActivity.class);
        startActivity(intent);
    }

    private void onButton3Click() {
        Intent intent = new Intent(this, BidirectionBindActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                onButton1Click();
                break;
            case R.id.btn3:
                onButton3Click();
                break;
            default:
                break;
        }
    }
}
