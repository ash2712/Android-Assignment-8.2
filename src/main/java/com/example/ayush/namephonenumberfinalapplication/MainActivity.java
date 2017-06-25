package com.example.ayush.namephonenumberfinalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<Data> InfoArray;
    private CustomAdapter mCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.my_list);
        InfoArray = new ArrayList<Data>();

        for(int i = 0; i < 10; i++){
            Data data = new Data();
            data.setName("Name " + i);
            data.setPhoneNumber("Phone Number " + i);
            InfoArray.add(data);

        }

        mCustomAdapter = new CustomAdapter(MainActivity.this, InfoArray);
        mListView.setAdapter(mCustomAdapter);
    }
}
