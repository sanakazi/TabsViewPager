package com.example.sanakazi.tabsviewpager.withtablayout;

/**
 * Created by InFinItY on 1/14/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MyPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int num) {

       if(num==0)
       {


           return new SampleFragment();

       }
        else
       {
           return new SampleFragment();
       }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
