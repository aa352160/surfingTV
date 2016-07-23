package com.example.jh352160.surfingtv.Index.customView.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.jh352160.surfingtv.Index.customView.IndexColumn;
import com.example.jh352160.surfingtv.Index.customView.Starsight;
import com.example.jh352160.surfingtv.R;

import java.util.List;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class MainActivityAdapter extends ArrayAdapter<View>{

    Context context;
    int resource;
    List<View> viewList;

    public MainActivityAdapter(Context context, int resource, List<View> viewList) {
        super(context, resource, viewList);
        this.context=context;
        this.resource=resource;
        this.viewList=viewList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(position==2||position==3){
            setListViewHeightBasedOnChildren(viewList.get(position),position);
        }
        return viewList.get(position);
    }

    private void setListViewHeightBasedOnChildren(View View,int position){
        ListView listView;
        if(position==2) {
            IndexColumn indexColumn = (IndexColumn) View;
            listView = (ListView) indexColumn.findViewById(R.id.columnList);
        }else{
            Starsight starsight=(Starsight)View;
            listView=(ListView)starsight.findViewById(R.id.starsight_list);
        }

        /**------------------ this is copy from the Internet----------------**/

        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {        return;    }
        int totalHeight = 0;
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            // listAdapter.getCount()返回数据项的数目
            View listItem = listAdapter.getView(i, null, listView);
            // 计算子项View 的宽高
            listItem.measure(0, 0);
            // 统计所有子项的总高度
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);

        /**------------------ this is copy from the Internet----------------**/
    }

}
