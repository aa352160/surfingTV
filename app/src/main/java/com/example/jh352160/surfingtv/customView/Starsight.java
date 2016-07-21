package com.example.jh352160.surfingtv.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.jh352160.surfingtv.R;
import com.example.jh352160.surfingtv.customView.adapter.StarsightListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/20
 */

public class Starsight extends LinearLayout {
    // TODO: 2016/7/20 first finish this
    private Context mContext;
    ListView listView;

    public Starsight(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public Starsight(Context context) {
        super(context);
        mContext = context;
        init();
    }


    private void init() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.index_starsight, this);
        listView = (ListView)findViewById(R.id.starsight_list);
        List<ImageView> imageViews = new ArrayList<>();
        int[] imagesId = {R.drawable.starsight_big_image, R.drawable.starsight_anne_hathaway};
        for (int i : imagesId) {
            ImageView imageView = new ImageView(mContext);
            imageView.setAdjustViewBounds(true);
            imageView.setMaxHeight(720);
            // TODO: 2016/7/21 layoutparam
//            LinearLayout.LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
//            layoutParams.height=200;
//            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(i);
            imageViews.add(imageView);
        }
        StarsightListAdapter adapter = new StarsightListAdapter(mContext, android.R.layout.simple_expandable_list_item_1, imageViews);
        listView.setAdapter(adapter);
    }
}
