package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    AppUtility appUtility;
    ListAdapterWithRecycleView listAdapterWithRecycleView;

    LinearLayoutManager linearLayoutManager;
    GridLayoutManager gridLayoutManager;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleListView);
        appUtility = AppUtility.getAppUtility(getApplicationContext());
        listAdapterWithRecycleView = new ListAdapterWithRecycleView(this, appUtility.getPeople());

        linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                return (position % 3 == 0 ? 2 : 1);
//            }
//        });
//        staggeredGridLayoutManager = new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.HORIZONTAL);
//
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listAdapterWithRecycleView);
    }
}
