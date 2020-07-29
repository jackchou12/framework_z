package com.fec.yunmall.projectcore.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.fec.yunmall.projectcore.R;


/**
 * Created by weiyang on 2017/12/24.
 * 底部导航栏单个Item,使用FrameLayout封装一个TextView
 */
public class BottomNavigationTab extends FrameLayout {
    private TextView mTextView;//控制图标和文本的TextView
    private int iconSize = 23;//图标大小,默认23dp
    private int tabTextSize = 10;//文字大小,默认10sp
    private int padding = 0;// 文字跟图标的间距
    private int defaultColor = 0xffaaaaaa;//默认的文本颜色
    private int pressedColor = 0xff000000;//按下的文本颜色
    private Drawable defaultDrawable;//默认的Icon
    private Drawable pressedDrawable;//按下的Icon
    private String tabText;//Tab的文本
    private int pointSize = 8;//小红点的大小

    private Paint mPaint;
    private boolean isDrawPoint;

    public BottomNavigationTab(@NonNull Context context) {
        this(context, null);
    }

    public BottomNavigationTab(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomNavigationTab(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        DisplayMetrics dm = getResources().getDisplayMetrics();
        iconSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, iconSize, dm);
        tabTextSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, tabTextSize, dm);
        padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, padding, dm);
        pointSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, pointSize, dm);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.BottomNavigationTab, 0, 0);
        iconSize = a.getDimensionPixelSize(R.styleable.BottomNavigationTab_iconSize, iconSize);
        tabTextSize = a.getDimensionPixelSize(R.styleable.BottomNavigationTab_textSize, tabTextSize);
        tabText = a.getString(R.styleable.BottomNavigationTab_tabText);
        padding = a.getDimensionPixelSize(R.styleable.BottomNavigationTab_iconAndTextPadding, padding);
        defaultColor = a.getColor(R.styleable.BottomNavigationTab_defaultColor, defaultColor);
        pressedColor = a.getColor(R.styleable.BottomNavigationTab_pressedColor, pressedColor);
        defaultDrawable = a.getDrawable(R.styleable.BottomNavigationTab_defaultIcon);
        pressedDrawable = a.getDrawable(R.styleable.BottomNavigationTab_pressedIcon);
        defaultDrawable.setBounds(0, 0, iconSize, iconSize);
        pressedDrawable.setBounds(0, 0, iconSize, iconSize);

        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        initTab(context);

        //FrameLayout onDraw()方法默认不执行
        setBackgroundColor(0x00000000);
    }

    private void initTab(Context context) {
        if (tabText!=null||!TextUtils.isEmpty(tabText)){
            mTextView = new TextView(context);
            LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            mTextView.setLayoutParams(params);
            mTextView.setText(tabText);
            mTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, tabTextSize);
            mTextView.setCompoundDrawablePadding(padding);
            mTextView.setGravity(Gravity.CENTER);
            addView(mTextView);
        }
        setChecked(false);
    }

    public void setChecked(boolean isChecked) {
        if (mTextView!=null){
            if (isChecked) {
                mTextView.setTextColor(pressedColor);
                mTextView.setCompoundDrawables(null, pressedDrawable, null, null);
            } else {
                mTextView.setTextColor(defaultColor);
                mTextView.setCompoundDrawables(null, defaultDrawable, null, null);
            }
            invalidate();
        }

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isDrawPoint) {
            int xPos = getMeasuredWidth() / 2 + mTextView.getMeasuredWidth() / 2;
            int yPos = getMeasuredHeight() / 2 - mTextView.getMeasuredHeight() / 2;
            canvas.drawCircle(xPos, yPos, pointSize / 2, mPaint);
        }
    }

    public void setDrawPoint(boolean drawPoint) {
        isDrawPoint = drawPoint;

        invalidate();
    }
}
