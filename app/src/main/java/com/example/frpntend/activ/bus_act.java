package com.example.frpntend.activ;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.frpntend.Bus;
import com.example.frpntend.Data;
import com.example.frpntend.R;
import com.example.frpntend.activ.adapter.Adapter_bus;

public class bus_act extends Activity {
    private Adapter_bus adapterBus;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        Bus bus = new Bus("21:21","22:21","rfyrfu","iehyfdui");
        Data.BUS_LIST.add(bus);
        Data.BUS_LIST.add(bus);
        Data.BUS_LIST.add(bus);
        Data.BUS_LIST.add(bus);
        Data.BUS_LIST.add(bus);
        Data.BUS_LIST.add(bus);
        recyclerView = findViewById(R.id.recycler_bus);
        adapterBus = new Adapter_bus(this,Data.BUS_LIST);
        recyclerView.setAdapter(adapterBus);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterBus.notifyDataSetChanged();

    }
}