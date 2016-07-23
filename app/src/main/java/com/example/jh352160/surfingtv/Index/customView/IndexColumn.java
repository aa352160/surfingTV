package com.example.jh352160.surfingtv.Index.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.jh352160.surfingtv.Index.customView.adapter.IndexColumnAdapter;
import com.example.jh352160.surfingtv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class IndexColumn extends LinearLayout{

    Context context;

    public IndexColumn(Context context) {
        super(context);
        this.context=context;
        init();
    }

    public IndexColumn(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init();
        }

    private void init(){
        LayoutInflater.from(context).inflate(R.layout.index_column,this);
        ListView listView=(ListView)findViewById(R.id.columnList);
        List<View> viewList=new ArrayList<>();
        int[] titleImag={R.drawable.index_column_title1, R.drawable.index_column_title2, R.drawable.index_column_title3, R.drawable.index_column_title4};
        int[] bigImage={R.drawable.index_column_big_image1, R.drawable.index_column_big_image2, R.drawable.index_column_big_image3, R.drawable.index_column_big_image4};
        for (int i=0;i<titleImag.length;i++){
            ItemIndexColumn item=new ItemIndexColumn(context);
            item.setImage(titleImag[i],bigImage[i]);
            item.setAdapter();
            viewList.add(item);
        }
        IndexColumnAdapter adapter=new IndexColumnAdapter(context, R.layout.item_index_column,viewList);
        listView.setAdapter(adapter);
    }
}
