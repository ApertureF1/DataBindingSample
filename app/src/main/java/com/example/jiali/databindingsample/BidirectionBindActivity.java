package com.example.jiali.databindingsample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.jiali.databindingsample.databinding.BidirectionBindActivityBinding;

public class BidirectionBindActivity extends Activity implements View.OnClickListener {
    private BidirectionBindBean bidirectionBindBean;
    private boolean flag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BidirectionBindActivityBinding bidirectionBindActivityBinding = DataBindingUtil.setContentView(this, R.layout.bidirection_bind_activity);
        bidirectionBindBean = new BidirectionBindBean();
        bidirectionBindBean.userName.set("TOM");
        bidirectionBindActivityBinding.setDoubleBindBean(bidirectionBindBean);
        bidirectionBindActivityBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_content_btn:
                //ObservableFields
                flag = !flag;
                if (flag) {
                    bidirectionBindBean.userName.set("JIM");
                } else {
                    bidirectionBindBean.userName.set("TOM");
                }
                break;
        }
    }
}
