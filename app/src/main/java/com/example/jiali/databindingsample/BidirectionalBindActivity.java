package com.example.jiali.databindingsample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.jiali.databindingsample.databinding.BidirectionalBindActivityBinding;

public class BidirectionalBindActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BidirectionalBindActivityBinding bidirectionalBindActivityBinding = DataBindingUtil.setContentView(this, R.layout.bidirectional_bind_activity);
        DataBindingBean dataBindingBean = new DataBindingBean();
        dataBindingBean.userName.set("TOM");
        bidirectionalBindActivityBinding.setDataBindingBean(dataBindingBean);
    }
}
