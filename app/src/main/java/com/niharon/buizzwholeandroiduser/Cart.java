package com.niharon.buizzwholeandroiduser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> quan=new ArrayList<>();
    ArrayList<String> unitprice=new ArrayList<>();
    ArrayList<String> total=new ArrayList<>();
    ArrayList<String> status=new ArrayList<>();
    ArrayList<Integer> image=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        //For testing
        quan.add("2");
        quan.add("3");
        quan.add("1");
        unitprice.add("1200");
        unitprice.add("360");
        unitprice.add("240");
        total.add("2400");
        total.add("1080");
        total.add("240");
        status.add("Pending");
        status.add("Pending");
        status.add("Pending");
        image.add(R.drawable.sample3);
        image.add(R.drawable.sample2);
        image.add(R.drawable.sample1);
        //End here
        recyclerView=findViewById(R.id.cart_recycleview);
        CartAdapter cartAdapter=new CartAdapter(this,quan,unitprice,total,status,image);
        recyclerView.setAdapter(cartAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}