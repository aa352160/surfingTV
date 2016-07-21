package com.example.jh352160.surfingtv.customView;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.jh352160.surfingtv.R;
import com.example.jh352160.surfingtv.customView.adapter.CommodityRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class ItemIndexColumn extends LinearLayout {

    IndexColumnBigImage indexColumnBigImage;
    RecyclerView recyclerView;
    Context context;
    CommodityRecyclerViewAdapter adapter;

    public ItemIndexColumn(Context context) {
        super(context);
        this.context=context;
        init();
    }

    public ItemIndexColumn(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init();
    }

    private void init(){
        LayoutInflater.from(context).inflate(R.layout.item_index_column,this);
        List<String> names=new ArrayList<>();
        List<String> lineTags=new ArrayList<>();
        List<String> prices =new ArrayList<>();
        int[] images=new int[3];
        adapter=new CommodityRecyclerViewAdapter(images,names,lineTags,prices);
        indexColumnBigImage=(IndexColumnBigImage)findViewById(R.id.column_big_image);
        recyclerView=(RecyclerView)findViewById(R.id.commodityList);
    }

    public void setImage(int titleImage,int bigImage){
        indexColumnBigImage.setImage(titleImage,bigImage);
    }

    public void setAdapter(){
        LinearLayoutManager llm = new LinearLayoutManager(context);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter( adapter );
    }
}
