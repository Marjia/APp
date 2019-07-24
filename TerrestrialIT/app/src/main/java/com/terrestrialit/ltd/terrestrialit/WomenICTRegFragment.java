package com.terrestrialit.ltd.terrestrialit;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import static android.view.View.GONE;

/**
 * Created by marzia on 9/13/2017.
 */

public class WomenICTRegFragment extends Fragment {

    View view;


    ProgressBar progressBar;
    Context context=getContext();

    public WomenICTRegFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.apply_online_training_fragment,container,false);


//        WebView webView=(WebView)view.findViewById(R.id.webview_id);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("http://terrestrialit.com/women-ict-freelancer/");

       // MakeAnimationMethod();

        renderpage(view);
        return view;
    }

    public void renderpage(View view){




        final WebView webView=(WebView)view.findViewById(R.id.webview_id);
        progressBar=(ProgressBar)view.findViewById(R.id.progress_bar_id);






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
                AlertDialog alertDialog = new AlertDialog.Builder(context).create();
                alertDialog.setTitle("Error");
                alertDialog.setMessage("Cannot connect to the R2R Server. Check your internet connection and try again.");
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().finish();
                        startActivity(getActivity().getIntent());
                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Go back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().onBackPressed();


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

        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if ((keyCode == KeyEvent.KEYCODE_BACK)) {
                        if(webView!=null)
                        {
                            if(webView.canGoBack())
                            {
                                webView.goBack();
                            }
                        }
                    }
                }
                return true;
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl("http://terrestrialit.com/women-ict-freelancer/");



    }

//    public void MakeAnimationMethod(){
//
//
//        TextView title = (TextView) view.findViewById(R.id.txtTitle);
//        android.view.animation.Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
//        title.setText(R.string.women_ict_form_reg_apply);
//        scaleAnimation.setRepeatMode(Animation.RESTART);
//        scaleAnimation.setRepeatCount(Animation.INFINITE);
//        title.startAnimation(scaleAnimation);
//    }
}
