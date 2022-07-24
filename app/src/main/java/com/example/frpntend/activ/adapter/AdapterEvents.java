package com.example.frpntend.activ.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frpntend.Data;
import com.example.frpntend.Event;
import com.example.frpntend.R;

import java.util.List;

public class AdapterEvents extends RecyclerView.Adapter<AdapterEvents.MyViewHolder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<Event> eventList;

    public AdapterEvents(Context context, List<Event> eventList){
        this.context = context;
        this.eventList = eventList;
        this.layoutInflater =LayoutInflater.from(context);

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_event,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Event event = Data.EVENT_LIST.get(position);

        ((MyViewHolder)holder).time.setText(event.getTime());
        ((MyViewHolder)holder).zagal.setText(event.getZagal());
        ((MyViewHolder)holder).content.setText(event.getContent());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }



    @Override
    public int getItemCount() {
        return Data.EVENT_LIST.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView time, content, zagal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.event_time);
            content = itemView.findViewById(R.id.event_content);
            zagal = itemView.findViewById(R.id.event_zag);

        }
    }
}
