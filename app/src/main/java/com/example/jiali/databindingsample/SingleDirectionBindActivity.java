package com.example.jiali.databindingsample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.jiali.databindingsample.databinding.SingleDirectionBindActivityBinding;

public class SingleDirectionBindActivity extends Activity implements View.OnClickListener {
    private DataBindingBean dataBindingBean;
    private boolean flag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SingleDirectionBindActivityBinding singleDirectionBindActivityBinding = DataBindingUtil.setContentView(this, R.layout.single_direction_bind_activity);
        dataBindingBean = new DataBindingBean();
        dataBindingBean.userName.set("TOM");
        singleDirectionBindActivityBinding.setDataBindingBean(dataBindingBean);
        singleDirectionBindActivityBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_content_btn:
                //ObservableFields
                flag = !flag;
                if (flag) {
                    dataBindingBean.userName.set("JIM");
                } else {
                    dataBindingBean.userName.set("TOM");
                }
                break;
        }
    }
}
