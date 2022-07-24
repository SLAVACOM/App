package com.example.frpntend.activ;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frpntend.Data;
import com.example.frpntend.News;
import com.example.frpntend.R;
import com.example.frpntend.activ.adapter.AdapterNews;

public class MainActivity extends Activity {

    private AdapterNews adapterNews;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        News bww = new News("XNJNFcjdnfsndfdsfs,fploskjfopls[fslkflspflsf's;fkl,sl;kmflksdmvcf,","sfdfsfdsfdhnbsj","17:35 456341");
        Data.NEWS_LIST.add(bww);
        Data.NEWS_LIST.add(bww);
        Data.NEWS_LIST.add(bww);
        Data.NEWS_LIST.add(bww);
        Data.NEWS_LIST.add(bww);
        Data.NEWS_LIST.add(bww);

        recyclerView = findViewById(R.id.recycler_news);
        adapterNews = new AdapterNews(this, Data.NEWS_LIST);
        recyclerView.setAdapter(adapterNews);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterNews.notifyDataSetChanged();

        startActivity(new Intent(this, event_act.class));
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}