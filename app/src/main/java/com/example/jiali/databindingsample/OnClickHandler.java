package com.example.jiali.databindingsample;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class OnClickHandler {
    private Context context;

    public OnClickHandler(Context context) {
        this.context = context;
    }

    public void onButton2Click(View view) {
        Intent intent = new Intent(context, CollectionDataActivity.class);
        context.startActivity(intent);
    }

    public void onButton2Click(User user) {
        Log.i("Test","user is: " + user);
        Intent intent = new Intent(context, CollectionDataActivity.class);
        context.startActivity(intent);
    }
}
