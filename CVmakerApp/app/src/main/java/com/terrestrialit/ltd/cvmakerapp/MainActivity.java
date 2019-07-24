package com.terrestrialit.ltd.cvmakerapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

   // Activity activity=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
       // navigationView.bringToFront();

        navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.camera_id) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id= item.getItemId();

        switch (id){
            case R.id.inbox_id:
                Toast.makeText(getApplicationContext(),"inbox",Toast.LENGTH_LONG).show();
                break;

            case R.id.draft_id:
                Toast.makeText(getApplicationContext(),"draft",Toast.LENGTH_LONG).show();
                break;

            case R.id.mail_id:
                Toast.makeText(getApplicationContext(),"mail",Toast.LENGTH_LONG).show();
                break;

            case R.id.spam_id:
                Toast.makeText(getApplicationContext(),"spam",Toast.LENGTH_LONG).show();
                break;

            case R.id.star_id:
                Toast.makeText(getApplicationContext(),"star",Toast.LENGTH_LONG).show();
                break;

            case R.id.trash_id:
                Toast.makeText(getApplicationContext(),"trash",Toast.LENGTH_LONG).show();
                break;

            case R.id.camera_id:
                Toast.makeText(getApplicationContext(),"camera",Toast.LENGTH_LONG).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}
