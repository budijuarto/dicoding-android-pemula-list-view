package com.example.celerates.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailBudiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_detail_budi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Budi budiditerima = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView wafat = (TextView)findViewById(R.id.content_wafat);

        Glide.with(this).load(budiditerima.getPhoto()).override(350,550).into(gambar);
        name.setText(budiditerima.getName());
        remarks.setText(budiditerima.getRemarks());
        deskripsi.setText(budiditerima.getDeskripsi());
        lahir.setText(budiditerima.getLahir());
        wafat.setText(budiditerima.getWafat());

        Log.i("photo", budiditerima.getPhoto());
        Log.i("deskripsi", budiditerima.getDeskripsi());
    }


}
