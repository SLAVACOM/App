package com.example.frpntend.activ.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frpntend.Bus;
import com.example.frpntend.Data;
import com.example.frpntend.R;

import java.util.List;

public class Adapter_bus extends RecyclerView.Adapter<Adapter_bus.MyViewHolder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<Bus> Bus_list;

    public Adapter_bus(Context context, List<Bus> Bus_list){
        this.context = context;
        this.Bus_list = Bus_list;
        this.layoutInflater =LayoutInflater.from(context);

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_bus,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Bus bus = Data.BUS_LIST.get(position);

        ((MyViewHolder)holder).time_1.setText(bus.getTime1());
        ((MyViewHolder)holder).time_2.setText(bus.getTime_2());
        ((MyViewHolder)holder).bus_st1.setText(bus.getName_1());
        ((MyViewHolder)holder).bus_st2.setText(bus.getName_2());

        
    }



    @Override
    public int getItemCount() {
        return Data.NEWS_LIST.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView time_1,time_2, bus_st1,bus_st2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            time_1 = itemView.findViewById(R.id.bus_time1);
            time_2 = itemView.findViewById(R.id.bus_time2);
            bus_st1 = itemView.findViewById(R.id.event_zag);
            bus_st2 = itemView.findViewById(R.id.bus_st2);

        }
    }
}
