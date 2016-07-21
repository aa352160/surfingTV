package com.example.jh352160.surfingtv.customView.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class IndexColumnAdapter extends ArrayAdapter<View>{

    List<View> viewList;
    Context context;

    public IndexColumnAdapter(Context context, int resource, List<View> viewList) {
        super(context, resource, viewList);
        this.context=context;
        this.viewList=viewList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return viewList.get(position);
    }

}
