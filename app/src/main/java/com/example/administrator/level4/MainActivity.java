package com.example.administrator.level4;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    List<Fragment> mFragments;
    FragmentAdapter mSecondAdapter;
    ViewPager mViewPager;
    String[] titles = new String[]{"头条","汽车","美女"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    private void initView(){
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.second_viewpager);
        mFragments = new ArrayList<>();
        mFragments.add(new Fragment_one());
        mFragments.add(new Fragment_two());
        mFragments.add(new Fragment_three());
        mSecondAdapter = new FragmentAdapter(getSupportFragmentManager());
        mSecondAdapter.setTitles(titles);
        mSecondAdapter.setFragments(mFragments);
        mViewPager.setAdapter(mSecondAdapter);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}