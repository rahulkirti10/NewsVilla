package com.example.newsvills;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder>   {
    private OnItemClickListener mlistener;
    Context context;
    List<News> list= new ArrayList<News>();
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener)
    {
        mlistener=listener;
    }
    public Adapter(List<News> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View photoView = inflater.inflate(R.layout.layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(photoView, mlistener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
            viewHolder.Name.setText(list.get(position).title);
        viewHolder.news.setText(list.get(position).author);
        Glide.with(viewHolder.itemView.getContext()).load(list.get(position).image).into(viewHolder.image);
    }

    @Override
    public int getItemCount()
    {

        return list.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }



}







