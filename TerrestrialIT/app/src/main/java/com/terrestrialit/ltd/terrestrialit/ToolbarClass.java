package com.terrestrialit.ltd.terrestrialit;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolbarClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String str="Terrestrial IT";

    }

    public void ToolbarMethod(String title){

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar_id);

        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();

        //toolbar.setNavigationIcon(R.drawable.aboutmidlist);
        actionBar.setTitle(title);

    }
}
