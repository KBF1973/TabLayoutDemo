package com.example.jsu.tablayoutdemo;

import android.support.v4.app.*;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount= numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
        case 0: return new tab1Fragment();
        case 1: return new tab2Fragment();
        case 2: return new tab3Fragment();
        default: return null;

    }
}

    @Override
    public int getCount() {
    return tabCount;
    }
}