package com.example.jiali.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jiali.databindingsample.databinding.CollectionDataActivityBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionDataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CollectionDataActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.collection_data_activity);

        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("key0", "map_value0");
        map.put("key1", "map_value1");
        binding.setMap(map);

        String[] arrays = {"String1", "String2"};
        binding.setArray(arrays);

    }
}
