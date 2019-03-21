package com.example.listcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// set the statue bar background to tranparent
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //setup recyclerview with the adapter

        RecyclerView recyclerView =findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,2500));
        mlist.add(new item(R.drawable.vijay2,"cities",R.drawable.logo1,3100));
        mlist.add(new item(R.drawable.vijay3,"cities",R.drawable.logo1,8000));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,10000));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,16000));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,4000));
        mlist.add(new item(R.drawable.vijay2,"cities",R.drawable.logo1,3100));
        mlist.add(new item(R.drawable.vijay3,"cities",R.drawable.logo1,8000));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,10000));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,2500));
        mlist.add(new item(R.drawable.vijay1,"cities",R.drawable.logo1,16000));


        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
