package com.example.jh352160.surfingtv.Index.customView;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.jh352160.surfingtv.Index.customView.adapter.BannerPagerAdapter;
import com.example.jh352160.surfingtv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/19
 */

public class Banner extends RelativeLayout{

    Context context;
    ViewPager viewPager;

    public Banner(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public Banner(Context context, AttributeSet attr){
        super(context,attr);
        this.context=context;
        init();
    }

    private void init(){
        LayoutInflater.from(context).inflate(R.layout.index_banner,this);
        viewPager=(ViewPager)findViewById(R.id.bannerViewPager);
        List<ImageView> imageViews=new ArrayList<ImageView>();
        int[] dotId={R.id.v_dot1, R.id.v_dot2, R.id.v_dot3, R.id.v_dot4};
        final List<View> dotViews=new ArrayList<View>();
        for (int i:dotId){
            dotViews.add(findViewById(i));
        }

        int[] imageId={R.drawable.banner_image1, R.drawable.banner_image2, R.drawable.banner_image3, R.drawable.banner_image4};
        for(int i:imageId){
            ImageView image=new ImageView(context);
            image.setImageResource(i);
            imageViews.add(image);
        }
        BannerPagerAdapter bannerPagerAdapter=new BannerPagerAdapter(imageViews);
        viewPager.setAdapter(bannerPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for(View i:dotViews){
                    i.setBackgroundColor(getResources().getColor(R.color.dotColor_unselected));
                }
                dotViews.get(position).setBackgroundColor(getResources().getColor(R.color.dotColor));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


}
