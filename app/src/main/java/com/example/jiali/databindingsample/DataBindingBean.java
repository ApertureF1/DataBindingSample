package com.example.jiali.databindingsample;

import android.databinding.ObservableField;

public class DataBindingBean {
    //ObservableBoolean, ObservableByte, ObservableChar, ObservableShort, ObservableInt,
    //ObservableLong, ObservableFloat, ObservableDouble, ObservableParcelable
    //ObservableArrayMap, ObservableArrayList

    //should make it public
    public final ObservableField<String> userName = new ObservableField<>();
}
