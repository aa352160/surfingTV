package com.example.jh352160.surfingtv;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.example.jh352160.surfingtv.customView.Banner;
import com.example.jh352160.surfingtv.customView.IndexColumn;
import com.example.jh352160.surfingtv.customView.IndexThematic;
import com.example.jh352160.surfingtv.customView.Starsight;
import com.example.jh352160.surfingtv.customView.adapter.MainActivityAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager bannerViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.mainList);
        List<View> viewList=new ArrayList<View>();
        viewList.add(new Banner(this));
        viewList.add(new IndexThematic(this));
        viewList.add(new IndexColumn(this));
        viewList.add(new Starsight(this));
        MainActivityAdapter adapter=new MainActivityAdapter(this,android.R.layout.simple_expandable_list_item_1,viewList);
        listView.setAdapter(adapter);
    }
}
