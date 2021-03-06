package com.example.jsu.lab4b;

import android.support.v4.app.*;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new tipFragment();
            case 1: return new tempFragment();
            case 2: return new distanceFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {

        return tabCount;

    }

}
