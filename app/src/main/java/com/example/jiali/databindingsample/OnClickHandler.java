package com.example.jiali.databindingsample;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class OnClickHandler {
    private Context context;

    public OnClickHandler(Context context) {
        this.context = context;
    }

    public void onButton2Click(View view) {
        Intent intent = new Intent(context, NoneBasicDataActivity.class);
        context.startActivity(intent);
    }
}
