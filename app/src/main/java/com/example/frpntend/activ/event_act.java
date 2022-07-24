package com.example.frpntend.activ;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.frpntend.Data;
import com.example.frpntend.Event;
import com.example.frpntend.R;
import com.example.frpntend.activ.adapter.AdapterEvents;

public class event_act extends Activity {

    private AdapterEvents adapterNews;
    public RecyclerView recyclerView;
    Event event = new Event("fdsfd","sfdoihfsdhfndishf","782:241");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        Data.EVENT_LIST.add(event);
        recyclerView = findViewById(R.id.recycler_events);
        adapterNews  = new AdapterEvents(this,Data.EVENT_LIST);
        recyclerView.setAdapter(adapterNews);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterNews.notifyDataSetChanged();
    }
}