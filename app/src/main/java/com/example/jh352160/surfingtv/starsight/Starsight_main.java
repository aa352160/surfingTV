package com.example.jh352160.surfingtv.starsight;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.jh352160.surfingtv.R;
import com.example.jh352160.surfingtv.starsight.customView.StarsightImage;
import com.example.jh352160.surfingtv.starsight.customView.adapter.StarsightAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jh352160 on 2016/7/21.
 */

public class Starsight_main extends AppCompatActivity implements View.OnClickListener{

    ImageView category_image1,category_image2,category_image3,category_image4,category_image5;
    ImageView iv1,iv2,iv3,iv4,iv5;
    Map<String,int[]> map;
    StarsightAdapter adapter;
    List<View> viewList;
    ListView imageList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starsight_page);
        init();
        for(int i:map.get("all")){
            StarsightImage starsightImage=new StarsightImage(this);
            starsightImage.setImage(i);
            viewList.add(starsightImage);
        }
        adapter=new StarsightAdapter(this,android.R.layout.simple_expandable_list_item_1,viewList);
        imageList.setAdapter(adapter);
    }

    private void init(){
        category_image1=(ImageView) findViewById(R.id.textView);
        category_image2=(ImageView) findViewById(R.id.textView2);
        category_image3=(ImageView) findViewById(R.id.textView3);
        category_image4=(ImageView) findViewById(R.id.textView4);
        category_image5=(ImageView) findViewById(R.id.textView5);
        category_image1.setOnClickListener(this);
        category_image2.setOnClickListener(this);
        category_image3.setOnClickListener(this);
        category_image4.setOnClickListener(this);
        category_image5.setOnClickListener(this);
        iv1=(ImageView)findViewById(R.id.imageView1);
        iv2=(ImageView)findViewById(R.id.imageView2);
        iv3=(ImageView)findViewById(R.id.imageView3);
        iv4=(ImageView)findViewById(R.id.imageView4);
        iv5=(ImageView)findViewById(R.id.imageView5);
        imageList=(ListView)findViewById(R.id.imageList);
        viewList=new ArrayList<>();
        int[] allStar={R.drawable.starsight_anne_hathaway,R.drawable.starsight_big_image,
                    R.drawable.starsight_big_image2,R.drawable.starsight_big_image3,
                    R.drawable.starsight_big_image4,R.drawable.starsight_big_image5};
        int[] star1={R.drawable.starsight_anne_hathaway};
        int[] star2={R.drawable.starsight_big_image2};
        int[] star3={R.drawable.starsight_big_image3};
        int[] star4={R.drawable.starsight_big_image4};
        map=new HashMap<>();
        map.put("all",allStar);
        map.put("star1",star1);
        map.put("star2",star2);
        map.put("star3",star3);
        map.put("star4",star4);
    }

    @Override
    public void onClick(View view) {
        viewList=new ArrayList<>();
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        iv4.setVisibility(View.INVISIBLE);
        iv5.setVisibility(View.INVISIBLE);
        category_image1.setImageResource(R.drawable.starsight_allstar_unselect);
        category_image2.setImageResource(R.drawable.starsight_foreign_male_unselect);
        category_image3.setImageResource(R.drawable.starsight_domestic_male_unselect);
        category_image4.setImageResource(R.drawable.starsight_domestic_female_unselect);
        category_image5.setImageResource(R.drawable.starsight_foreign_female_unselect);
        int[] image={};
        switch (view.getId()){
            case R.id.textView:
                iv1.setVisibility(View.VISIBLE);
                image=map.get("all");
                category_image1.setImageResource(R.drawable.starsight_allstar_select);
                break;
            case R.id.textView2:
                iv2.setVisibility(View.VISIBLE);
                image=map.get("star1");
                category_image2.setImageResource(R.drawable.starsight_foreign_male_select);
                break;
            case R.id.textView3:
                iv3.setVisibility(View.VISIBLE);
                image=map.get("star2");
                category_image3.setImageResource(R.drawable.starsight_domestic_male_select);
                break;
            case R.id.textView4:
                iv4.setVisibility(View.VISIBLE);
                image=map.get("star3");
                category_image4.setImageResource(R.drawable.starsight_domestic_female_select);
                break;
            case R.id.textView5:
                iv5.setVisibility(View.VISIBLE);
                image=map.get("star4");
                category_image5.setImageResource(R.drawable.starsight_foreign_female_select);
                break;
        }
        for(int i:image){
            StarsightImage starsightImage=new StarsightImage(this);
            starsightImage.setImage(i);
            viewList.add(starsightImage);
        }
        adapter=new StarsightAdapter(this,android.R.layout.simple_expandable_list_item_1,viewList);
        imageList.setAdapter(adapter);
    }
}
