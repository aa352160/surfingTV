package com.example.jh352160.surfingtv.Index.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.jh352160.surfingtv.R;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class IndexColumnBigImage extends RelativeLayout{

    int titleImage,bigImage;
    ImageView title,bigImageView;
    Context context;

    public IndexColumnBigImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        LayoutInflater.from(context).inflate(R.layout.index_column_big_image,this);
        title=(ImageView)findViewById(R.id.index_column_title);
        bigImageView=(ImageView)findViewById(R.id.index_column_big_image);
        //title.setImageResource(titleImage);
        title.setImageResource(R.drawable.index_column_title1);
//        bigImageView.setImageResource(bigImage);
        bigImageView.setImageResource(R.drawable.index_column_big_image2);
    }

    public void setImage(int titleImage,int bigImage){
        bigImageView.setImageResource(bigImage);
        title.setImageResource(titleImage);
    }

}
