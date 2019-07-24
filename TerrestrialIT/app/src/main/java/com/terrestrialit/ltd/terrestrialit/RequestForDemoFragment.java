package com.terrestrialit.ltd.terrestrialit;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.takisoft.datetimepicker.DatePickerDialog;
import com.takisoft.datetimepicker.widget.DatePicker;

import java.text.DateFormatSymbols;
import java.util.Calendar;

import static android.view.View.GONE;

/**
 * Created by marzia on 9/13/2017.
 */

public class RequestForDemoFragment extends Fragment {


    View view;


    EditText NameEDT,MobileEDT,AddressEDT,EmailEDT,DueDateEDT,NationalIdEDT,FacebookIdEDT,EducationEDT,ProfessionEDT,LaptopEDT,PreferredEDT;

    Spinner SelecetProductSpinner,UrgentProjectSpinner,ProfessionSpinner,PersonalLaptopSpinner;

    String[] SelectProductSTR={"Shilalipi School ERP","Micro-Credit Management System","SEO","E-Commerce platform","E-Tender","Hospital Management System"};
    //String[] UrgentProjectSTR={"Low","Medium","High"};
//    String[] ProfessionSTR={"Student","Service","House Wife","Other"};
//    String[] LaptopSTR={"Yes","No"};

//    TextView datofbirthtxt;

  //  int yearO,dayO,monthO;

    Button SendMailBTN;


    Context context=getContext();
    ProgressBar progressBar;

    public RequestForDemoFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.request_for_demo_fragment,container,false);


        MakeAnimationMethod();
        SendMailMethod();
        //renderpage(view);
//        WebView webView=(WebView)view.findViewById(R.id.webview_id);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("http://terrestrialit.com/contact/request-for-demo/");
        return view;
    }



    public void SendMailMethod() {

        final String[] servicesproject = new String[1];
       // final String[] urgentproject = new String[1];
//        final String[] Profession = new String[1];
//        final String[] laptop = new String[1];

        SendMailBTN=(Button)view.findViewById(R.id.send_mail_id);


        NameEDT=(EditText)view.findViewById(R.id.name_id);
        MobileEDT=(EditText)view.findViewById(R.id.mobile_id);
        AddressEDT=(EditText)view.findViewById(R.id.address_id);
        EmailEDT=(EditText)view.findViewById(R.id.email_id);
        //NationalIdEDT=(EditText)view.findViewById(R.id.nationalidnumber_id);
        //FacebookIdEDT=(EditText)view.findViewById(R.id.facebookid_id);

        //EducationEDT=(EditText)view.findViewById(R.id.education_qualification_id);
        //ProfessionEDT=(EditText)view.findViewById(R.id.profession_id);
        //LaptopEDT=(EditText)view.findViewById(R.id.laptop_id);
        //PreferredEDT=(EditText)view.findViewById(R.id.preferred_training_id);


        //----------Education Qualification Spinner--------------------------------

        //--usingCalenderDailogue--------

//        Calendar calendar= Calendar.getInstance();
//        yearO=calendar.get(Calendar.YEAR);
//        monthO = calendar.get(Calendar.MONTH);
//        dayO = calendar.get(Calendar.DAY_OF_MONTH);
//        DueDateEDT=(EditText)view.findViewById(R.id.due_date_id);
//        //datofbirthtxt=(TextView)view.findViewById(R.id.dateofbirthtxt_id);
//
//        DueDateEDT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), R.style.MyDatePickerDialogStyle, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker view, int year, int monthofyear, int dayofmonth) {
//
//                        //monthofyear=monthofyear+1;
////                        text.setText(dayofmonth+"/"+monthofyear+"/"+year+"-");
////
////                        String t=text.getText().toString();
////                        System.out.printf("\n\n--------------------"+t+"\n\n");
//                        int yearO = year;
//                        int monthO = monthofyear;
//                        int dayO = dayofmonth;
//                        Calendar c = Calendar.getInstance();
//                        c.set(Calendar.YEAR, year);
//                        c.set(Calendar.MONTH, monthofyear);
//                        c.set(Calendar.DAY_OF_MONTH, dayofmonth);
//
//                        String monstr = new DateFormatSymbols().getShortMonths()[monthO];
//
//                        String date = dayO+"/"+monthO+"/"+yearO;
//                        //System.out.printf("\n\n--------------------"+dateEDT+"\n\n");
////                        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
////                        String weekday = new DateFormatSymbols().getWeekdays()[dayOfWeek];
//                        //text.setText(dayofmonth + "/" + monthofyear + "/" + year + "--" + weekday);
////                        text.setText(yearO+"");
////                        wekdaymonttXT.setText(weekday+", "+monstr+" "+dayO);
////                        wekdaymonttXT.setPaintFlags(wekdaymonttXT.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//                        //System.out.printf("\n\n--------------------"+t+"\n\n");
//
//
//                        DueDateEDT.setText(date);
//                    }
//                }, yearO, monthO, dayO);
////                showDate(view);
////                selectEDT.setText(getdate());
//
//                datePickerDialog.show();
//
//
//                // datePickerDialog.setVersion(DatePickerDialog.Version.VERSION_2);
//            }
//
//
//        });




        SelecetProductSpinner=(Spinner)view.findViewById(R.id.select_project_spinner_id);

        ArrayAdapter<String> servicearrayAdapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_spinner_dropdown_item,SelectProductSTR);
        SelecetProductSpinner.setAdapter(servicearrayAdapter);
        SelecetProductSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//
//                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
//                ((TextView) parent.getChildAt(0)).setTextSize(15);
                servicesproject[0]=SelecetProductSpinner.getSelectedItem().toString();
                //Toast.makeText(getContext(),"selected"+EducationQSTR[position],Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        //-----------------Urgent Project Spinner----------------------------------


//        UrgentProjectSpinner=(Spinner)view.findViewById(R.id.urgent_progect_spinner_id);
//
//        ArrayAdapter<String> urgentarrayAdapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_spinner_dropdown_item,UrgentProjectSTR);
//        UrgentProjectSpinner.setAdapter(urgentarrayAdapter);
//        UrgentProjectSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//
//                ((TextView) parent.getChildAt(0)).setTextColor(R.color.colorTextHeader);
//                ((TextView) parent.getChildAt(0)).setTextSize(15);
//
//                urgentproject[0]=UrgentProjectSpinner.getSelectedItem().toString();
//                //Toast.makeText(getContext(),"selected"+PreferredTrainingSTR[position],Toast.LENGTH_LONG).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

        //----------Profession Spinner----------

//
//        ProfessionSpinner=(Spinner)view.findViewById(R.id.profession_spinner_id);
//
//        ArrayAdapter<String> professionarrayAdapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_spinner_dropdown_item,ProfessionSTR);
//        ProfessionSpinner.setAdapter(professionarrayAdapter);
//        ProfessionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//
//                ((TextView) parent.getChildAt(0)).setTextSize(15);
//                Profession[0]=ProfessionSpinner.getSelectedItem().toString();
//                //Toast.makeText(getContext(),"selected"+ProfessionSTR[position],Toast.LENGTH_LONG).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//

        //------------Personal Laptop Spinner--------------


//        PersonalLaptopSpinner=(Spinner)view.findViewById(R.id.personal_laptop_spinner_id);
//
//        ArrayAdapter<String> laptoparrayAdapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_spinner_dropdown_item,LaptopSTR);
//        PersonalLaptopSpinner.setAdapter(laptoparrayAdapter);
//        PersonalLaptopSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//
//                ((TextView) parent.getChildAt(0)).setTextSize(15);
//                laptop[0]=PersonalLaptopSpinner.getSelectedItem().toString();
//                //Toast.makeText(getContext(),"selected"+LaptopSTR[position],Toast.LENGTH_LONG).show();
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//



        //textView=(TextView)view.findViewById(R.id.name_txt_id);

        SendMailBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String subjectstr="Submit a Quate";
                String nanamestr=NameEDT.getText().toString().trim();
                String namestr=nanamestr;
                String mobilestr=MobileEDT.getText().toString().trim();

                // System.out.print("\n----------------------------------------"+mobilestr+"-----------------\n");
                String addressstr=AddressEDT.getText().toString().trim();
                String emailstr=EmailEDT.getText().toString().trim();
                //String nationalidstr=NationalIdEDT.getText().toString().trim();
                //String facebookidstr=FacebookIdEDT.getText().toString().trim();

                //String duedatestr=DueDateEDT.getText().toString().trim();
                //String educationstr=EducationEDT.getText().toString().trim();
                //String professionstr=ProfessionEDT.getText().toString().trim();
                //String laptopstr=LaptopEDT.getText().toString().trim();
                //String preferredstr=PreferredEDT.getText().toString().trim();

                //      textView.setText(namestr+" "+addressstr);

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","terrestrialit@gmail.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subjectstr);
                intent.putExtra(Intent.EXTRA_TEXT, "Selected Product : "+servicesproject[0]+"\n"
                        +"Full Name: "+namestr+"\n"
                        +"\n"+"Address: "+addressstr+"\n"
                        +"\n"+"Mobile: "+mobilestr+"\n"
                        +"\n"+"Email: "+emailstr+"\n"
                );
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));


                intent.putExtra(Intent.EXTRA_SUBJECT,"");

                NameEDT.setText("");
                MobileEDT.setText("");
                AddressEDT.setText("");
                EmailEDT.setText("");
                //NationalIdEDT.setText("");
                //FacebookIdEDT.setText("");
                //DateofBirthEDT.setText("");
                //EducationEDT.setText("");
                //ProfessionEDT.setText("");
                //LaptopEDT.setText("");
                //PreferredEDT.setText("");

            }
        });


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
        webView.loadUrl("http://terrestrialit.com/contact/request-for-demo/");



    }

    public void MakeAnimationMethod(){


        TextView title = (TextView) view.findViewById(R.id.txtTitle);
        android.view.animation.Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
        title.setText(R.string.request_for_demo);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
