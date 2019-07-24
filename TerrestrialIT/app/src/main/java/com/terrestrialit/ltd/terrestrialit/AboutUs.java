package com.terrestrialit.ltd.terrestrialit;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class AboutUs extends ToolbarClass {


    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        String titile="About Us";
        ToolbarMethod(titile);
        AboutUsTabLayoutMethod();

    }

    public void AboutUsTabLayoutMethod(){

//
//        toolbar=(Toolbar)findViewById(R.id.toolbar_id);
//        setSupportActionBar(toolbar);


        //initialize viePager object
        viewPager =(ViewPager)findViewById(R.id.viewpager_id);

        //Create veiwPager  adapter
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());


        //adding fragment classes to adapter object which use methos addFragment , it add item fragment
        // and title into FragmentList and FragmentTitleList
        //string act as title
        adapter.addFragment(new AboutUsFragment(),"About Us");
        adapter.addFragment(new PortfolioFragment(),"Portfolio");
        adapter.addFragment(new CareerFragment(),"Career");

        //adding adapter object to viewpager object
        viewPager.setAdapter(adapter);

        //initialize tablayout object
        tabLayout =(TabLayout)findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
