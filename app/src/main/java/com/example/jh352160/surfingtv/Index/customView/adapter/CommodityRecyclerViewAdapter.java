package com.example.jh352160.surfingtv.Index.customView.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jh352160.surfingtv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/7/20.
 */

public class CommodityRecyclerViewAdapter extends RecyclerView.Adapter<CommodityRecyclerViewAdapter.ViewHolder>{

    int[] images;
    List<String> names,linetags,prices;

    public CommodityRecyclerViewAdapter(int[] images,List<String> names,List<String> linetags,List<String> prices){
        /// TODO: 2016/7/20 try to delete super() function
        super();
//        this.images=images;
//        this.names=names;
//        this.linetags=linetags;
//        this.prices=prices;
//        this.images=new int[]{R.drawable.commodity_goodman1,R.drawable.commodity_goodman2,R.drawable.commodity_goodman3};
        this.images=new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
        this.names=new ArrayList<String>();
        this.names.add("好先生1");
        this.names.add("好先生2");
        this.names.add("好先生3");

        this.linetags=new ArrayList<String>();
        this.linetags.add("宣传语1");
        this.linetags.add("宣传语2");
        this.linetags.add("宣传语3");

        this.prices=new ArrayList<String>();
        this.prices.add("￥100");
        this.prices.add("￥200");
        this.prices.add("￥300");

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= View.inflate(parent.getContext(), R.layout.item_index_commodity,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.image.setImageResource(images[position]);
        holder.name.setText(names.get(position));
        holder.linetag.setText(linetags.get(position));
        holder.price.setText(prices.get(position));

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name,linetag,price;

        public ViewHolder(View itemView) {
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.commodityImage);
            name=(TextView)itemView.findViewById(R.id.commodityName);
            linetag=(TextView)itemView.findViewById(R.id.commodityTagline);
            price=(TextView)itemView.findViewById(R.id.commodityPrice);
        }
    }
}
