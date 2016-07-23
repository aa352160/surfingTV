package com.example.jh352160.surfingtv.Index.customView.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class BannerPagerAdapter extends PagerAdapter {

    private List<ImageView> imageList;

    public BannerPagerAdapter(List<ImageView> imageList){
        this.imageList=imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(imageList.get(position));
        return imageList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(imageList.get(position));
    }
}
