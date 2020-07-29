package com.fec.yunmall.projectcore.util;

import android.text.InputFilter;
import android.text.Spanned;

/**
 * @author zhoubo
 * @date 2020/5/8
 * @describe
 */
public class DecimalDigitsInputFilter implements InputFilter {

    private final int decimalDigits;
    private final int maxLength;
    /**
     * Constructor.
     *          用于设置edittext的小数位数
     * @param decimalDigits maximum decimal digits
     */
    public DecimalDigitsInputFilter(int decimalDigits,int maxlength) {
        this.decimalDigits = decimalDigits;
        this.maxLength = maxlength;
    }

    /**
     *
     * @param source    即将输入的字符串
     * @param start     source的开始
     * @param end       source的结束
     * @param dest      已经有的内容
     * @param dstart    要替换或者添加的起始位置，即光标所在的位置
     * @param dend      要替换或者添加的终止始位置，若为选择一串字符串进行更改，则为选中字符串 最后一个字符在dest中的位置
     * @return          返回null表示全部替换位置上的字符，也就是全部输入
     */
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        if (dest.length()>=maxLength){
            return "";
        }
        String reg="^[0-9|.]*$";
        if (!source.toString().matches(reg)){
            return "";
        }

        int dotPos = -1;
        int len = dest.length();
        for (int i = 0; i < len; i++) {
            char c = dest.charAt(i);
            if (c == '.' || c == ',') {
                dotPos = i;
                break;
            }
        }

        //之前没有小数点，要在第一位添加小数点，而且添加位置后面没有指定位以上字符，添加0.
        if(dotPos<0&&(source.equals(".")||source.equals(","))&&dstart ==0&&len-dend<=decimalDigits){
            return "0.";
        }

        //添加小数点的后面有指定位数以上数字，不添加字符
        if((source.equals(".")||source.equals(","))&&len-dend>decimalDigits){
            return "";
        }

        if (dotPos >= 0) {//已经包含小数点

            if (source.equals(".") || source.equals(","))//新输入的内容为小数点
            {
                return "";//已经有小数点，不添加小数点了返回空的
            }
            // 小数点之前添加则正常添加字符
            if (dend <= dotPos) {
                return null;
            }
            if (len - dotPos > decimalDigits) {//小数点后面的位数大于指定的位数则返回空的
                return "";
            }
        }
        return null;
    }

}
