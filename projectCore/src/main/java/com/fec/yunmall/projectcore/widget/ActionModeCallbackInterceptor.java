package com.fec.yunmall.projectcore.widget;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/**
 * @author zhoubo
 * @date 2020/6/5
 * @describe 禁止edittext复制粘贴
 */
public class ActionModeCallbackInterceptor implements ActionMode.Callback {


    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return false;
    }


    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }


    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return false;
    }


    public void onDestroyActionMode(ActionMode mode) {
    }
}
