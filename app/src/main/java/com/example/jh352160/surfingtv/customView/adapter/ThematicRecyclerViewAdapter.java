package com.example.jh352160.surfingtv.customView.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jh352160.surfingtv.R;

import java.util.List;

/**
 * Created by jh352160 on 2016/7/20
 */

public class ThematicRecyclerViewAdapter extends RecyclerView.Adapter<ThematicRecyclerViewAdapter.ViewHolder>{

    //private List<ImageView> imageViews;
    private int[] images;
    private List<String> titles;

    public ThematicRecyclerViewAdapter(List<ImageView> imageViews,List<String> titles){
        super();
        //this.imageViews=imageViews;
        images= new int[]{R.drawable.thematic_image1, R.drawable.thematic_image2, R.drawable.thematic_image3, R.drawable.thematic_image4};
        this.titles=titles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= View.inflate(parent.getContext(), R.layout.item_index_thematic,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.image.setImageResource(images[position]);
        //holder.image=images.get(position);
        holder.title.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            image=(ImageView) itemView.findViewById(R.id.image);
            title=(TextView) itemView.findViewById(R.id.title);
        }
    }
}
