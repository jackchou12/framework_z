package com.fec.yunmall.projectcore.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiyang on 2017/2/27.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> fragmentTitles = new ArrayList<>();

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment) {
        fragments.add(fragment);
        fragmentTitles.add("");
    }

    public void addFragment(Fragment fragment, String title) {
        fragments.add(fragment);
        fragmentTitles.add(title);
    }

    public <T extends Fragment> T getFragment(int position) {
        return (T) fragments.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles.get(position);
    }

    public void setPageTitle(int position, String value){
        if (fragmentTitles.size()>position&&position>=0){
            fragmentTitles.set(position,value);
            notifyDataSetChanged();
        }
    }
}
