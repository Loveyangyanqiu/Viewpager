package com.example.administrator.level4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by xushuzhan on 2016/12/2.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> mFragments;
    String [] mtitles;
    public void setTitles(String [] titles){
        mtitles = titles;
    }
    public void setFragments(List<Fragment> fragments){
        mFragments = fragments;
    }
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    public CharSequence getPageTitle(int position){
        return mtitles[position];
    }
}
