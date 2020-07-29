package com.fec.yunmall.projectcore.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.fec.yunmall.projectcore.widget.scrollview.DefaultFooterSmall;
import com.fec.yunmall.projectcore.widget.scrollview.MyHeaderNoStatusViewSmall;

/**
 * @author zhoubo
 * @date 2020/4/10
 * @describe 判断是否拦截滑动
 */
public class MyScrollView extends NestedScrollView {
    Context context;

    public MyScrollView (Context context) {
        super(context);
        this.context = context;
    }

    public MyScrollView (Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public MyScrollView (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
    }

    ViewPager viewPager;
    MyHeaderNoStatusViewSmall myHeaderNoStatusViewSmallLeft;
    DefaultFooterSmall defaultFooterSmallLeft;

    public void setViewpager(ViewPager viewPager, MyHeaderNoStatusViewSmall myHeaderNoStatusViewSmallLeft, DefaultFooterSmall defaultFooterSmallLeft) {
        this.viewPager = viewPager;
        this.myHeaderNoStatusViewSmallLeft = myHeaderNoStatusViewSmallLeft;
        this.defaultFooterSmallLeft = defaultFooterSmallLeft;
    }

    int viewpagerHeight = 0;
    int viewpagerLocalY = 0;

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        int[] location = new int[2];
        if (viewPager != null) {
            viewPager.getLocationOnScreen(location);
            viewpagerHeight = location[1] + viewPager.getHeight();
            viewpagerLocalY = location[1];
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                final float curY = ev.getRawY();
                if (viewPager != null) {
                    if (curY <= viewpagerHeight && curY >= viewpagerLocalY || (myHeaderNoStatusViewSmallLeft != null && myHeaderNoStatusViewSmallLeft.isDraw) || (defaultFooterSmallLeft != null && defaultFooterSmallLeft.isDraw) ) {
                        return false;
                    }
                }
        }
        return super.onInterceptTouchEvent(ev);
    }
}
