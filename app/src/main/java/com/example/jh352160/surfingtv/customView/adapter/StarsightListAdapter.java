package com.example.jh352160.surfingtv.customView.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class StarsightListAdapter extends ArrayAdapter {

    private int resourseId;
    private List<ImageView> imageViews;
    private Context context;

    public StarsightListAdapter(Context context, int resource, List<ImageView> imageViews) {
        super(context, resource, imageViews);
        resourseId=resource;
        this.imageViews=imageViews;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return imageViews.get(position);
    }

}
