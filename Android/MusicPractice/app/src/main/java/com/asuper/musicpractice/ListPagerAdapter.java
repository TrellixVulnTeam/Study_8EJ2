package com.asuper.musicpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by super on 2017-10-13.
 */

public class ListPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> list;
    public ListPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }
    @Override
    public  Fragment getItem(int position) {return list.get(position);}
    @Override
    public int getCount() {return list.size();}
}
