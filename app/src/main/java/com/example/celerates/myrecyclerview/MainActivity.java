package com.example.celerates.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Budi>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(BudiData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewBudiAdapter cardViewPresidentAdapter= new CardViewBudiAdapter(this);
        cardViewPresidentAdapter.setListBudi(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);

    }

}
