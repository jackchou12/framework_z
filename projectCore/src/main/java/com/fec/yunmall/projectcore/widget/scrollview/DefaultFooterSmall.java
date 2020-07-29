package com.fec.yunmall.projectcore.widget.scrollview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fec.yunmall.projectcore.R;
import com.liaoinstan.springview.container.BaseFooter;

/**
 * @author zhoubo
 * @date 2020/4/10
 * @describe
 */
public class DefaultFooterSmall extends BaseFooter {
    private Context context;
    private int rotationSrc;
    public TextView footerTitle;
    private ProgressBar footerProgressbar;

    public DefaultFooterSmall(Context context) {
        this(context, R.drawable.progress_small);
    }

    public DefaultFooterSmall(Context context, int rotationSrc) {
        this.context = context;
        this.rotationSrc = rotationSrc;
    }

    @Override
    public View getView(LayoutInflater inflater, ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.default_footer, viewGroup, true);
        footerTitle = (TextView) view.findViewById(R.id.default_footer_title);
        footerTitle.setTextSize(12);
        footerProgressbar = (ProgressBar) view.findViewById(R.id.default_footer_progressbar);
        footerProgressbar.setIndeterminateDrawable(ContextCompat.getDrawable(context, rotationSrc));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) footerProgressbar.getLayoutParams();
        layoutParams.width = 32;
        layoutParams.height = 32;
        footerProgressbar.setLayoutParams(layoutParams);
        return view;
    }

    @Override
    public void onPreDrag(View rootView) {
    }

   public boolean isDraw = false;

    @Override
    public void onDropAnim(View rootView, int dy) {
        if (dy > -3) {
            isDraw = false;
        } else {
            isDraw = true;
        }
    }

    @Override
    public void onLimitDes(View rootView, boolean upORdown) {
        if (upORdown) {
            footerTitle.setText("松开载入更多");
        } else {
            footerTitle.setText("查看更多");
        }
    }

    @Override
    public void onStartAnim() {
        footerTitle.setVisibility(View.INVISIBLE);
        footerProgressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onFinishAnim() {
        footerTitle.setText("查看更多");
        footerTitle.setVisibility(View.VISIBLE);
        footerProgressbar.setVisibility(View.INVISIBLE);
    }
}
