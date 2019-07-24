package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    boolean gridViewResized = false;
    WebView webView;
    CircleImageView propicimg;
    ExpandableHeightgridView EduGridview,TrainingGridview;
   FullLengthListView ExprGridview;
   TextView profileName;
    //ListView listExp;

    String[] degree_name={"SSC","HSC","BSC","MSC","BSC","MSC"};
    String[] university_name={"Khilgaon Girls School and College","Khilgaon model college ","Institute of science and technology","Institute of science and technology technology technology technology technology","Institute of science and technology"
            ,"United State of america andaustralia University of science and technology"};
    String[] duration_year={"2000-2004","2004-2005","2005-2006","2006-2007","2005-2006","2006-2007"};


    String[] designation_exp_name={"General Manager","Teacher","Doctor","Designer","CEO","Professor"};
    String[] company_exp_name={"Terrestrial IT","Institute of science and technology ","Popular Medical College and hospital","ENA development company","Institute of science and technology"
            ,"Envoy group"};

    String[] duti_exp_name={
            "Graduating or final year students from top universities with a high GPA and no work experience may apply.",
            "Graduating or final year students from top universities with a high GPA and no work experience may apply. ",
            "Graduating or final year students from top universities with a high GPA and no work experience may apply.",
            "Graduating or final year students from top universities with a high GPA and no work experience may apply.",
            "Graduating or final year students from top universities with a high GPA and no work experience may apply."
            ,"  I am a Mobile App Developer at Wahyd Private Limited .I am expert in developing Iphone and Ipad apps.Beside this i have good skills in asp.net. I started my professional career as early as i could due to eagerness to explore new technologies .My professional expertise are enhanced by the following attitude"};
    String[] duration_exp_year={"2000-2004","2004-2005","2005-2006","2006-2007","2005-2006","2006-2007"};



    String[] training_name={"Web Development","Android development","C# development","Graphic Designing","SQA","Algorithm"};
    String[] institute_name={"X Institute","Y institute","Z institute","L institute","Institute of science and technology"
            ,"Curse era"};
    String[] duration_training_year={"2000-2004","2004-2005","2005-2006","2006-2007","2005-2006","2006-2007"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        propicimg=(CircleImageView)findViewById(R.id.propic_id);
        propicimg.setFocusable(true);

        profileName=(TextView)findViewById(R.id.profiilename_txt_id);

        String nameFromIntent = getIntent().getStringExtra("Name");
        profileName.setText(nameFromIntent);


        profileName.setFocusable(true);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        EduAdapterMethod();
        NavigatinDrawerMethod();
        justText();
       // EduTitleText();
//        TrainingTitleText();
//        WorkingExperianceTitleText();
    }

    public void NavigatinDrawerMethod(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }




    public void justText(){

        webView = (WebView) findViewById(R.id.webview);

        String text = "<html><body>"
                + "<p style=\"font-size:12px\" align=\"justify\">"
                + getString(R.string.lorem_ipsum)
                + "</p> "
                + "</body></html>";

        webView.loadData(text, "text/html", "utf-8");

    }



//    public void EduTitleText(){
//
//      WebView  EduTitleWebView = (WebView) findViewById(R.id.education_title_txt_id);
//
//        String text = "<html><body>"
//                + "<p style=\"font-size:13px\" align=\"justify\"-moz-text-align-last=\" center\"text-align-last=\" center\">"
//                + getString(R.string.education_title_txt)
//                + "</p> "
//                + "</body></html>";
//
//        EduTitleWebView.loadData(text, "text/html", "utf-8");
//
//    }
//    public void TrainingTitleText(){
//
//        WebView  TrainingTitleWebView = (WebView) findViewById(R.id.training_title_txt_id);
//
//        String text = "<html><body>"
//                + "<p style=\"font-size:13px\" align=\"justify\">"
//                + getString(R.string.training_title_txt)
//                + "</p> "
//                + "</body></html>";
//
//        TrainingTitleWebView.loadData(text, "text/html", "utf-8");
//
//    }

//    public void WorkingExperianceTitleText(){
//
//        WebView  WorkinExperianceTitleWebView = (WebView) findViewById(R.id.work_experiance_title_txt_id);
//
//        String text = "<html><body>"
//                + "<p style=\"font-size:13px\" align=\"justify\">"
//                + getString(R.string.working_experiance_title_txt)
//                + "</p> "
//                + "</body></html>";
//
//        WorkinExperianceTitleWebView.loadData(text, "text/html", "utf-8");
//
//    }




    public void EduAdapterMethod(){
        EduGridview=(ExpandableHeightgridView) findViewById(R.id.education_grid_id);
        ExprGridview= (FullLengthListView) findViewById(R.id.experience_grid_id);
        TrainingGridview=(ExpandableHeightgridView)findViewById(R.id.training_grid_id);
        //listExp=(ListView)findViewById(R.id.list_exper_id);

//        setDynamicHeight(EduGridview);
        Education_Adapter education_adapter=new Education_Adapter(MainActivity.this,degree_name,university_name,duration_year);
        EduGridview.setAdapter(education_adapter);
        EduGridview.setExpanded(true);
        EduGridview.setFocusable(false);
        EduGridview.setFocusableInTouchMode(false);

        Education_Adapter training_adapter=new Education_Adapter(MainActivity.this,training_name,institute_name,duration_training_year);
        TrainingGridview.setAdapter(training_adapter);
        TrainingGridview.setExpanded(true);
        TrainingGridview.setFocusable(false);
        TrainingGridview.setFocusableInTouchMode(false);


        Experiance_Adapter experiance_adapter=new Experiance_Adapter(MainActivity.this,designation_exp_name,company_exp_name
                ,duti_exp_name,duration_exp_year);
        ExprGridview.setAdapter(experiance_adapter);
        ExprGridview.setFocusable(false);
        ExprGridview.setFocusableInTouchMode(false);

       // setListViewHeightBasedOnChildren(ExprGridview);

        //ExprGridview.setExpanded(true);

        education_adapter.notifyDataSetChanged();
        //setGridViewHeightBasedOnChildren(EduGridview,2);
     //   listExp.setAdapter(education_adapter);



//        EduGridview.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//
//                if (!gridViewResized) {
//                    gridViewResized = true;
//                    resizeGridView(EduGridview, degree_name.length, 2);
//                }
//
//            }
//        });


    }

    public static void setListViewHeightBasedOnChildren(FullLengthListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }




//
//    private void gridlay(int count){
//        int totalHeight = (count / 2);
//
//        if (count % 2 != 0) {
//            totalHeight++;
//        }
//
//        ViewGroup.LayoutParams params = ExprGridview.getLayoutParams();
//
//        params.height = <height of a row> * totalHeight;
//
//        ExprGridview.setLayoutParams(params);
//        ExprGridview.requestLayout();
//
//    }

//
//    private void setDynamicHeight(GridView gridView) {
//        ListAdapter gridViewAdapter = gridView.getAdapter();
//        if (gridViewAdapter == null) {
//            // pre-condition
//            return;
//        }
//
//        int totalHeight = 0;
//        int items = gridViewAdapter.getCount();
//        int rows = 0;
//
//        View listItem = gridViewAdapter.getView(0, null, gridView);
//        listItem.measure(0, 0);
//        totalHeight = listItem.getMeasuredHeight();
//
//        float x = 1;
//        if( items > 2 ){
//            x = items/2;
//            rows = (int) (x + 1);
//            totalHeight *= rows;
//        }
//
//        ViewGroup.LayoutParams params = gridView.getLayoutParams();
//        params.height = totalHeight;
//        gridView.setLayoutParams(params);
//    }
//

//    private void resizeGridView(GridView gridView, int items, int columns) {
//        ViewGroup.LayoutParams params = gridView.getLayoutParams();
//        int oneRowHeight = gridView.getHeight();
//        int rows = (int) (items / columns);
//        params.height = oneRowHeight * rows;
//        gridView.setLayoutParams(params);
//    }

//    public void setGridViewHeightBasedOnChildren(GridView gridView, int columns) {
//        ListAdapter listAdapter = gridView.getAdapter();
//        if (listAdapter == null) {
//            // pre-condition
//            return;
//        }
//
//        int totalHeight = 0;
//        int items = listAdapter.getCount();
//        int rows = 0;
//
//        View listItem = listAdapter.getView(0, null, gridView);
//        listItem.measure(0, 0);
//        totalHeight = listItem.getMeasuredHeight();
//
//        float x = 1;
//        if( items > columns ){
//            x = items/columns;
//            rows = (int) (x + 1);
//            totalHeight *= rows;
//        }
//
//        ViewGroup.LayoutParams params = gridView.getLayoutParams();
//        params.height = totalHeight;
//        gridView.setLayoutParams(params);
//
//    }
//

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_show_cv) {
            // Handle the camera action
            Intent intentCvShow=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intentCvShow);
        } else if (id == R.id.nav_education_quality) {

            Intent intentEducationEdit=new Intent(MainActivity.this,Education_Info_show.class);
            startActivity(intentEducationEdit);

        }
        else if (id == R.id.nav_training_summary) {
            Intent intentworkExp=new Intent(MainActivity.this,TrainingSummaryShowActivity.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.nav_work_experiance) {
            Intent intentworkExp=new Intent(MainActivity.this,WorkExperianceShow.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.nav_specialization) {
            Intent intentworkExp=new Intent(MainActivity.this,SpecializationActivity.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.nav_extra_curricular_activity) {
            Intent intentworkExp=new Intent(MainActivity.this,ExtraCurricularActivity.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.language_proficiency) {
            Intent intentworkExp=new Intent(MainActivity.this,LanguageProficiencyShow.class);
            startActivity(intentworkExp);


        }
        else if (id == R.id.nav_personal_info) {
            Intent intentworkExp=new Intent(MainActivity.this,PersonalInformationShow.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.nav_reference) {
            Intent intentworkExp=new Intent(MainActivity.this,Reference.class);
            startActivity(intentworkExp);

        }
        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {
            Intent intentlogin=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intentlogin);


        } else if (id == R.id.action_settings) {

            Intent intentlogin=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intentlogin);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
