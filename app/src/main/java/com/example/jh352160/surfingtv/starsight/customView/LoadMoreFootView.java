package com.example.jh352160.surfingtv.starsight.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.aspsine.swipetoloadlayout.SwipeLoadMoreTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;

/**
 * Created by jh352160 on 2016/7/25.
 */

public class LoadMoreFootView extends TextView implements SwipeLoadMoreTrigger,SwipeTrigger{
    public LoadMoreFootView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onLoadMore() {
        setText("正在拼命加载数据...");
    }

    @Override
    public void onPrepare() {
        setText("松开加载更多");
    }

    @Override
    public void onSwipe(int i, boolean b) {
        setText("向下滑动加载更多");
    }

    @Override
    public void onRelease() {

    }

    @Override
    public void complete() {
        setText("加载完成");
    }

    @Override
    public void onReset() {

    }
}
