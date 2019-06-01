package com.example.celerates.myrecyclerview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewBudiAdapter extends RecyclerView.Adapter<CardViewBudiAdapter.CardViewHolder> {

    private ArrayList<Budi>listBudi;
    private Context context;
    private Activity activity;

    public CardViewBudiAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Budi> getListBudi() {
        return listBudi;
    }

    public void setListBudi(ArrayList<Budi> listBudi) {
        this.listBudi = listBudi;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_budi, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Budi k = getListBudi().get(position);
        Glide.with(context).load(k.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getRemarks());
        holder.Budi = k;



        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share"+getListBudi().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListBudi().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail, btnsahre;
        Budi Budi;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvname = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvremarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share);
            btndetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            imgPhoto.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailBudiActivity.class);
            intent.putExtra("key", Budi);
            context.startActivity(intent);
        }
    }
}
