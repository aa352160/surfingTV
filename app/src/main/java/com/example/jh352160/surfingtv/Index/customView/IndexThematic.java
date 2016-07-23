package com.example.jh352160.surfingtv.Index.customView;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jh352160.surfingtv.R;
import com.example.jh352160.surfingtv.Index.customView.adapter.ThematicRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class IndexThematic extends LinearLayout{

    Context context;

    public IndexThematic(Context context) {
        super(context);
        this.context=context;
        init();
    }

    public IndexThematic(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init();
    }

    private void init(){
        LayoutInflater.from(context).inflate(R.layout.index_thematic,this);
        List<String> titles=new ArrayList<>();
        List<ImageView> imageViews=new ArrayList<>();
        int[] imageId={R.drawable.thematic_image1,R.drawable.thematic_image2,R.drawable.thematic_image3,R.drawable.thematic_image4};
        String[] title={"专题标题1","专题标题2","专题标题3","专题标题4"};
        for(int i:imageId){
            ImageView image=new ImageView(context);
            image.setImageResource(i);
            imageViews.add(image);
        }
        for(String i:title){
            titles.add(i);
        }
        ThematicRecyclerViewAdapter adapter=new ThematicRecyclerViewAdapter(imageViews,titles);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        // TODO: 2016/7/20 search why need use LinearLayoutManager
        LinearLayoutManager llm = new LinearLayoutManager(context);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter( adapter );
    }

}
