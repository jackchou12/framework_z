package com.fec.yunmall.projectcore.widget;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * @author zhoubo
 * @date 2020/4/8
 * @describe 限制edittext不能输入空格
 */
class EditChangedListener implements TextWatcher {
    private CharSequence temp;//监听前的文本
    private int editStart;//光标开始位置
    private int editEnd;//光标结束位置
    private final int charMaxNum = 28;
    int length;

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (length < charMaxNum) {
            if (s.toString().contains(" ")) {
                String[] str = s.toString().split(" ");
                String str1 = "";
                for (int i = 0; i < str.length; i++) {
                    str1 += str[i];
                }
            }
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (length > charMaxNum) {
            s.delete(editStart - 1, editEnd);
        }
    }

}

