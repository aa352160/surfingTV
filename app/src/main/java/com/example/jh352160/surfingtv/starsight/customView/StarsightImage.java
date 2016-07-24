package com.example.jh352160.surfingtv.starsight.customView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jh352160.surfingtv.R;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class StarsightImage extends RelativeLayout {

    ImageView bigImage;
    Button imageButton;
    private Boolean isPrise=false;
    TextView pricetext;

    public StarsightImage(final Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.starsight_image,this);
        bigImage=(ImageView)findViewById(R.id.bigImage);
        imageButton=(Button)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPrise){
                    imageButton.setBackgroundResource(R.drawable.starsight_unpraised);
                    isPrise=false;
                }else{
                    imageButton.setBackgroundResource(R.drawable.starsight_praised);
                    Animation priceAnim= AnimationUtils.loadAnimation(context,R.anim.price);
                    pricetext=(TextView)findViewById(R.id.pricetext);
                    pricetext.setVisibility(VISIBLE);
                    pricetext.startAnimation(priceAnim);
                    pricetext.setVisibility(INVISIBLE);
                    isPrise=true;
                }
            }
        });
        //int[] imageID={R.drawable.starsight_anne_hathaway,R.drawable.starsight_big_image2,R.drawable.starsight_big_image3,R.drawable.starsight_big_image4,R.drawable.starsight_big_image5};
    }

    public void setImage(int imageId){
        bigImage.setImageResource(imageId);
    }
}