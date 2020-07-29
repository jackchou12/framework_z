package com.fec.yunmall.projectcore.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/3/26
 * @describe 侧滑删除列表辅助viewadapter
 * RecyclerView adapter基类
 * <p>
 *
 * 用于数据与view绑定
 *
 * @param <T> A data bean class that will be used by the adapter.
 *            <p>
 *            Created by DavidChen on 2018/5/30.
 */

 public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerViewHolder> implements View.OnClickListener {

    protected Context mContext;
    protected List<T> mData;
    private int mLayoutId;
    //普通布局
    public static final int TYPE_NORMAL = 0;
    //脚布局分类
    public static final int TYPE_FOOTER = 2;
    private View mFooterView;

    protected OnItemClickListener mListener;

    protected  BaseRecyclerViewAdapter(Context context, List<T> data, int layoutId) {
        this.mContext = context;
        this.mData = data;
        this.mLayoutId = layoutId;
    }

    public void setmData(List<T> mData) {
        this.mData = mData;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (mFooterView != null && viewType == TYPE_FOOTER) {
            return new RecyclerViewHolder(mFooterView);
        }

        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        view.setOnClickListener(this);
        return new RecyclerViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        if (mFooterView != null && position == getItemCount() - 1) {
            return TYPE_FOOTER;
        }
        return TYPE_NORMAL;
    }

    /**
     * Add footer view
     *
     * @param footerView
     */
    public void setFooterView(View footerView) {
        this.mFooterView = footerView;
        notifyItemInserted(getItemCount() - 1);
    }

    public void removeFooterView(){
        this.mFooterView = null;
    }

    /**
     * Add footer view res
     *
     * @param c,layoutId
     */
    public void setFooterView(Context c,ViewGroup parent ,int layoutId) {
        if (c == null && layoutId < 0) {
            return;
        }
        this.mFooterView = LayoutInflater.from(c).inflate(layoutId,parent,false);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Get footer view
     *
     * @return
     */
    public View getFooterView() {
        return this.mFooterView;
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        if (getItemViewType(position) == TYPE_FOOTER) {
            return;
        }
        holder.itemView.setTag(position);
        T bean = mData.get(position);
        onBindData(holder, bean, position);
    }

    @Override
    public int getItemCount() {
        int count = mData.size();
        if (mFooterView != null) {
            count++;
        }
        return count;
    }

    @Override
    public void onClick(View v) {
        if (mListener != null) {
            mListener.onItemClick(this, v, (Integer) v.getTag());
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mListener = onItemClickListener;
    }

    /**
     * 数据绑定，由实现类实现
     *
     * @param holder   The reference of the all view within the item.
     * @param bean     The data bean related to the position.
     * @param position The position to bind data.
     */
    protected abstract void onBindData(RecyclerViewHolder holder, T bean, int position);

    /**
     * item点击监听器
     */
    public interface OnItemClickListener {
        /**
         * item点击回调
         *
         * @param adapter  The Adapter where the click happened.
         * @param v        The view that was clicked.
         * @param position The position of the view in the adapter.
         */
        void onItemClick(RecyclerView.Adapter adapter, View v, int position);
    }
}