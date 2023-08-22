package com.example.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);
        list.add(new Country(R.drawable.hanquoc,"Hàn Quốc","1823.232.23","39.333.222"));
        list.add(new Country(R.drawable.laos,"Lào","13.22.23","72.382.322"));
        list.add(new Country(R.drawable.thailan,"Thái Lan","18.32.23","71.233.111"));

        adapterCustom = new AdapterCustom(list,R.layout.customlistview,MainActivity.this);
        listView.setAdapter(adapterCustom);
    }
    private ListView listView;
    private List<Country> list = new ArrayList<>();
    private AdapterCustom adapterCustom;
}