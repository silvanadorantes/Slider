package com.example.silvanadorantes.slider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana on 26/06/16.
 */
public class AdapterFragmentPager extends FragmentPagerAdapter {

    List<Fragment> fragments;
    private Context context;


    public AdapterFragmentPager(FragmentManager fragmentManager, Context context){
        super(fragmentManager);
        this.fragments = new ArrayList<Fragment>();
        this.context = context;

    }

    public void addFragment(Fragment fragment){
        this.fragments.add(fragment);

    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
