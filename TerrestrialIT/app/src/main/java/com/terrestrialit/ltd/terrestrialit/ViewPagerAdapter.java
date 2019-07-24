package com.terrestrialit.ltd.terrestrialit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marzia on 9/27/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //declare List of type fragment to store item fragment on arrray list ,since it is constent I use final
    private final List<Fragment> fragmentList=new ArrayList<>();
    //Declaring list of string to keep item Fragment titles
    private final List<String> fragmentTitleList= new ArrayList<>();

    //Constructor

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //overrie method

    @Override
    public Fragment getItem(int position) {

        //returns fragment list
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        //return fragmentTitleList size
        return fragmentTitleList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return fragmentTitleList.get(position);
    }

    //method to add item fragment and its respected title into fragmentList array and FragmentTitleList
    public void addFragment(Fragment fragment, String title){

        fragmentList.add(fragment);
        fragmentTitleList.add(title);

    }
}
