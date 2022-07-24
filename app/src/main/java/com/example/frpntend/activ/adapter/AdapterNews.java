package com.example.frpntend.activ.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frpntend.Data;
import com.example.frpntend.News;
import com.example.frpntend.R;

import java.util.List;

public class AdapterNews extends RecyclerView.Adapter<AdapterNews.MyViewHolder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<News> newsList;

    public AdapterNews(Context context, List<News> newsList){
        this.context = context;
        this.newsList = newsList;
        this.layoutInflater =LayoutInflater.from(context);

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_news,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        News news = Data.NEWS_LIST.get(position);

        ((MyViewHolder)holder).time.setText(news.getTime());
        ((MyViewHolder)holder).zagal.setText(news.getZagal());
        ((MyViewHolder)holder).event.setText(news.getEvent());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }



    @Override
    public int getItemCount() {
        return Data.NEWS_LIST.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView time, event, zagal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time_news);
            event = itemView.findViewById(R.id.news_news);
            zagal = itemView.findViewById(R.id.news_zag);

        }
    }
}
