package com.jiyun.lalala;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/1 0001.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    private ArrayList<CarChang> mlist;

    public MyAdapter(ArrayList<CarChang> mlist) {
        this.mlist = mlist;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.img.setImageResource(mlist.get(position).getImg());
        holder.weizhi.setText(mlist.get(position).getWeizhi());
        holder.name.setText(mlist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView name,weizhi;
        private ImageView img;
        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.df);
            weizhi = itemView.findViewById(R.id.weizhi);
            img = itemView.findViewById(R.id.item_img);
        }
    }
}
