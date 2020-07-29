package com.fec.yunmall.projectcore.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fec.yunmall.projectcore.R;

import java.util.ArrayList;

/**
 * @author zhoubo
 * @date 2020/6/23
 * @describe 字母索引控件
 */
public class LetterIndexView extends View {
    // 字母表中的字符
    private ArrayList<String> alphabet = new ArrayList<>();

    // 字母的颜色
    private int defaultColor = getResources().getColor(R.color.grgray);
    private int selectColor =  getResources().getColor(R.color.colorPrimary);

    // 被选中的字符
    private int selectedIndex = 0;

    //提示控件
    private TextView tips;

    // 画笔--用于绘制右侧字母
    Paint paint = new Paint();

    // 选中的字母被改变监听器
    private OnTouchLetterChangedListener changedListener;
    // 选中的字母被释放监听器
    private OnTouchLetterReleasedListener releasedListener;

    public LetterIndexView(Context context) {
        super(context);
    }

    public LetterIndexView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LetterIndexView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (alphabet.size() ==0 )return;
        // 获取当前View的宽度和高度
        int width = getWidth();
        // 计算单个字符所占高度
        int singleLetter = getHeight() / (alphabet.size());

        // 自上而下逐一绘制字母表中的每个字符
        for (int i = 0; i < alphabet.size(); i++) {
            // 若没有没选中时显示默认颜色，若被选中显示指定的高亮色
            if (i != selectedIndex) {
                paint.setColor(defaultColor);
                paint.setAntiAlias(true);
                paint.setTextSize(25);
            } else {
                paint.setTextSize(25);
                paint.setColor(selectColor);
            }

            // 计算第i个字符在屏幕中的位置(x,y)
            float x = width / 2 - paint.measureText(alphabet.get(i)) / 2;
            float y = singleLetter * (i + 1);

            // 在指定位置绘制指定字符
            canvas.drawText(alphabet.get(i), x, y, paint);
            // 重置画笔的属性
            paint.reset();
        }
    }
    //控件默认的宽高
    int defaultWidth = 60;
    int defaultHeight = 800;
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        defaultHeight = 40*alphabet.size();
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int withSize = MeasureSpec.getSize(widthMeasureSpec);

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        if(getLayoutParams().width == ViewGroup.LayoutParams.WRAP_CONTENT
                && getLayoutParams().height == ViewGroup.LayoutParams.WRAP_CONTENT){
            setMeasuredDimension(defaultWidth,defaultHeight);
        } else if(getLayoutParams().width == ViewGroup.LayoutParams.WRAP_CONTENT){
            setMeasuredDimension(defaultWidth,heightSize);
        } else if(getLayoutParams().height == ViewGroup.LayoutParams.WRAP_CONTENT){
            setMeasuredDimension(withSize,defaultHeight);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        // 被触摸的是字母表中的第几个字符
        int currentIndex = (int) (event.getY() / 40);
        int action = event.getAction();
        if (currentIndex<0)currentIndex = 0;
        if (currentIndex>alphabet.size()-1)currentIndex=alphabet.size()-1;
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                if (tips!=null)tips.setVisibility(View.VISIBLE);
                // 监听到按下事件后修改被选中字符位置标识，并显示字母表的背景同时利用接口函数修改被选中字符
               // if (currentIndex >= 0 && currentIndex < alphabet.size()) {
                    selectedIndex = currentIndex;
                  //  if(changedListener!=null)
                   // changedListener.onTouchLetterChangedListener(alphabet.get(currentIndex),currentIndex);
                    //setBackgroundResource(R.drawable.alpha_bg);
                    if (tips!=null)
                    tips.setText(alphabet.get(selectedIndex));
                    invalidate();
               // }
                break;
            case MotionEvent.ACTION_MOVE:
                // 监听到正在滑动中的事件后修改被选中字符位置标识，利用接口函数修改被选中字符
               // if (currentIndex >= 0 && currentIndex < alphabet.size()) {
                    selectedIndex = currentIndex;
                if (tips!=null)
                    tips.setText(alphabet.get(selectedIndex));
                //if(changedListener!=null)
                    //changedListener.onTouchLetterChangedListener(alphabet.get(currentIndex),currentIndex);
                    invalidate();
                //}
                break;
            case MotionEvent.ACTION_UP:
                if (tips!=null)tips.setVisibility(View.GONE);
                // 监听到弹起事件后，调用相应的监听事件并将字母表的背景设置为没有背景
               if (releasedListener!=null)
                releasedListener.onTouchLetterReleasedListener();
                if(changedListener!=null)
                    changedListener.onTouchLetterChangedListener(alphabet.get(currentIndex),currentIndex);

                setBackgroundDrawable(null);
                invalidate();
                break;
            default:
                break;
        }

        return true;
    }

    // 设置字母表中的字符
    public void setAlphabet(ArrayList<String> alphabet) {
        this.alphabet = alphabet;
        selectedIndex = 0;
        requestLayout();
        invalidate();
    }

    // 设置字母默认显示的颜色
    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    // 设置字母被选中时显示的颜色
    public void setSelectColor(int selectColor) {
        this.selectColor = selectColor;
    }

    // 设置选中字母已改变监听事件
    public void setOnTouchLetterChangedListener(
            OnTouchLetterChangedListener changedListener) {
        this.changedListener = changedListener;
    }

    // 设置已释放字母选中监听事件
    public void setOnTouchLetterReleasedListener(
            OnTouchLetterReleasedListener releasedListener) {
        this.releasedListener = releasedListener;
    }

    public interface OnTouchLetterChangedListener {

        public void onTouchLetterChangedListener(String s,int currentIndex);
    }

    public interface OnTouchLetterReleasedListener {

        public void onTouchLetterReleasedListener();
    }

    public void setTipsView(TextView tipsView) {
        this.tips = tipsView;
    }
}
