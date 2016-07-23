package com.example.jh352160.surfingtv.starsight.customView;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.jh352160.surfingtv.R;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class StarsightImage extends RelativeLayout {

    ImageView bigImage;

    public StarsightImage(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.starsight_image,this);
        bigImage=(ImageView)findViewById(R.id.bigImage);
        //int[] imageID={R.drawable.starsight_anne_hathaway,R.drawable.starsight_big_image2,R.drawable.starsight_big_image3,R.drawable.starsight_big_image4,R.drawable.starsight_big_image5};
    }

    public void setImage(int imageId){
        bigImage.setImageResource(imageId);
    }
}