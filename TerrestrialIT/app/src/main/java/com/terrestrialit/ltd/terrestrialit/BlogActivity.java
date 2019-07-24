package com.terrestrialit.ltd.terrestrialit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import static android.view.View.GONE;

public class BlogActivity extends ToolbarClass {


    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ProgressBar progressBar;
    Activity activity=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        String title="Blog";

        ToolbarMethod(title);
        renderpage();

        //BlogTabLayoutMethod();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void renderpage(){






        final WebView webView=(WebView)findViewById(R.id.webview_id);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar_id);






        webView.setWebViewClient(new WebViewClient(){



            public void onReceivedError(WebView webView, int errorCode, String description, String failingUrl) {

                //webView.loadUrl("about:blank");

//                webView.loadUrl("file:///android_asset/sample.html");
//
//                progressBar.setIndeterminate(false);
//                setProgressBarVisibility(false);
//////                webView.stopLoading();
//////                Toast.makeText(getApplicationContext(),"errorCode = "+errorCode,Toast.LENGTH_LONG).show();
//////                Merror=errorCode;
//////                if(errorCode==2){
//////
//////                    webView.loadUrl("file:///android_asset/sample.html");
//////
//////                }
//////                else{
//////
//////                        webView.getSettings().setJavaScriptEnabled(true);
//////                        webView.loadUrl("https://stackoverflow.com/questions/6552160/prevent-webview-from-displaying-web-page-not-available");
//////
//////                }
////////                else{
////////                    Merror=false;
////////                }
//////---------------***************-------------------------
                System.out.print("\n\n---------------------------------------------- on Received  error -------------------------\n\n");
                try {
                    webView.stopLoading();
                } catch (Exception e) {
                }
                try {
                    webView.clearView();
                } catch (Exception e) {
                }
                webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
                webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
                if (Build.VERSION.SDK_INT >= 11){
                    webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
                }
//                setProgressBarVisibility(false);
                webView.loadUrl("about:blank");
                webView.loadUrl("file:///android_asset/defaultpage.html");
                AlertDialog alertDialog = new AlertDialog.Builder(getApplicationContext()).create();
                alertDialog.setTitle("Error");
                alertDialog.setMessage("Cannot connect to the R2R Server. Check your internet connection and try again.");
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finish();
                        startActivity(activity.getIntent());
                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Go back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.onBackPressed();


                    }
                });

                alertDialog.show();
//
//                webView.clearView();
                webView.loadUrl("about:blank");
                super.onReceivedError(webView, errorCode, description, failingUrl);

            }


            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                //webView.loadUrl("about:blank");
            }



            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                progressBar.setProgress(0);
                progressBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(GONE);
                super.onPageFinished(view, url);
            }
        });

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, final int newProgress) {
                progressBar.setProgress(newProgress);


                super.onProgressChanged(view, newProgress);
            }

        });

//        webView.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
//                    if ((keyCode == KeyEvent.KEYCODE_BACK)) {
//                        if(webView!=null)
//                        {
//                            if(webView.canGoBack())
//                            {
//                                webView.goBack();
//                            }
//                        }
//                    }
//                }
//                return true;
//            }
//        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl("http://terrestrialit.com/blog/");



    }


//    public void BlogTabLayoutMethod(){
//
////
////        toolbar=(Toolbar)findViewById(R.id.toolbar_id);
////        setSupportActionBar(toolbar);
//
//
//        //initialize viePager object
//        viewPager =(ViewPager)findViewById(R.id.viewpager_id);
//
//        //Create veiwPager  adapter
//        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
//
//
//        //adding fragment classes to adapter object which use methos addFragment , it add item fragment
//        // and title into FragmentList and FragmentTitleList
//        //string act as title
//        //adapter.addFragment(new FreeSeminarFragment(),"Free Seminar on Freelancing");
//        adapter.addFragment(new ITOnlineTrainingFragment(),"Online IT Training");
//        adapter.addFragment(new TrainingForWomenFragment(),"Free Training For Women");
//        adapter.addFragment(new SpecialTrainingFragment(),"SPECIALIZED TRAINING FOR WEB & GRAPHICS");
//        adapter.addFragment(new WomenICTRegFragment(),"Women ICT Registration Form");
//        adapter.addFragment(new WordPressThemeTrainingFragment(),"WORDPRESS THEME DEVELOPMENT");
//        adapter.addFragment(new CCNATrainingFragment(),"CCNA");
//        adapter.addFragment(new AdvanceGraphicDesinignTrainingFragment(),"Advanced Graphics Design");
//        adapter.addFragment(new AdvanceWebDesinignTrainingFragment(),"Advanced Web Design");
//
//
//        //adding adapter object to viewpager object
//        viewPager.setAdapter(adapter);
//
//        //initialize tablayout object
//        tabLayout =(TabLayout)findViewById(R.id.tablayout_id);
//        tabLayout.setupWithViewPager(viewPager);
//
//    }
}
