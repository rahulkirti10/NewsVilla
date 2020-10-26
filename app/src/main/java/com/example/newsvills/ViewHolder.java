package com.example.newsvills;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
public class ViewHolder extends RecyclerView.ViewHolder
{
    TextView Name,news;
    ImageView image;
    ViewHolder(View itemView, final Adapter.OnItemClickListener listener)
    {
        super(itemView);
        Name=itemView.findViewById(R.id.textView);
        news=itemView.findViewById(R.id.News);
        image=itemView.findViewById(R.id.image);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener!=null)
                {
                    int position=getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION){
                        listener.onItemClick(position);
                    }
                }
            }
        });
    }
}
