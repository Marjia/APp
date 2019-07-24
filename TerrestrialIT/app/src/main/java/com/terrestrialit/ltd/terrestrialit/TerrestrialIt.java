package com.terrestrialit.ltd.terrestrialit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class TerrestrialIt extends AppCompatActivity {


    ListView listView;
    LinearLayout boostsale;
    ImageView responsiveImageView,BoostSaleImageBTn,EcommerceIMGBTN,SupportIMGBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrestrial_it);



//        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //status bar emne shorai
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Initialize();
        SettingAdapter();
        ClickMethod();

//        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(getApplicationContext());
//        socialMediaCickFragmentClass.SocialMediaClickMethod();
        SocialMediaClickMethod();
    }

    public void SocialMediaClickMethod() {
        ImageView Fb,Twit,Googleplus,Linkedin,Skype;

        Fb=(ImageView)findViewById(R.id.facebook_id);
        Twit=(ImageView)findViewById(R.id.twitter_id);
        Googleplus=(ImageView)findViewById(R.id.googleplus);
        Linkedin=(ImageView)findViewById(R.id.linkedin_id);
        Skype=(ImageView)findViewById(R.id.skype_id);


        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/TerrestrialIT/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://twitter.com/terrestrialit"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });
        Googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://plus.google.com/+terrestrialit"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.linkedin.com/company/terrestrial-it"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        Skype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(TerrestrialIt.this);
                } else {
                    builder = new AlertDialog.Builder(TerrestrialIt.this);
                }
                builder.setTitle("Skype ID name is:")
                        .setMessage("terrestrialit")
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                // continue with delete
                            }
                        }).show();


            }
        });
    }

    public void Initialize(){
        listView=(ListView)findViewById(R.id.list_id);
        boostsale=(LinearLayout)findViewById(R.id.boost_sale_layout_id);
        responsiveImageView=(ImageView)findViewById(R.id.responsivedesignimage_btn_id);
        BoostSaleImageBTn=(ImageView)findViewById(R.id.boost_sale_image_btn_id);
        EcommerceIMGBTN=(ImageView)findViewById(R.id.ecommerce_down_n_img_btn);
        SupportIMGBTN=(ImageView)findViewById(R.id.support_down_img_btn);

    }

    public void SettingAdapter(){
        final String[] Title={"Services","Products","Training","Blog","About Us","Our Achievements","Contact"
        };
        int[] ImageId={
                R.drawable.serviceblueicon,
                R.drawable.productsblueicon,
                R.drawable.trainingblueicon,
                R.drawable.blogblueicon,
                R.drawable.aboutblueicon,
                R.drawable.achivementblueicon,
                R.drawable.contactblueicon,
        };
        CustomAdapter customAdapter= new CustomAdapter(TerrestrialIt.this,Title,ImageId);
        listView.setAdapter(customAdapter);
        listView.setFocusable(false);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                String item = (String) adapterView.getItemAtPosition(i);
//                // Display the selected item
//                //TextView txt=(TextView)findViewById(R.id.title_id);
//                Toast.makeText(MainActivity.this,"Selected : " + item,Toast.LENGTH_SHORT).show();

                TextView txt=(TextView)findViewById(R.id.title_id);
                //Toast.makeText(getApplicationContext(),"Selected"+Title[i],Toast.LENGTH_SHORT).show();

                if(i==0){

                    Intent intentOne=new Intent(getApplicationContext(),ServicesActivity.class);
                    startActivity(intentOne);

                }else if(i==1){

                    Intent intentTwo=new Intent(getApplicationContext(),ProductActivity.class);
                    startActivity(intentTwo);

                }else if(i==2){

                    Intent intentThree=new Intent(getApplicationContext(),TrainingActivity.class);
                    startActivity(intentThree);

                }
                else if(i==3){

                    Intent intentFour=new Intent(getApplicationContext(),BlogActivity.class);
                    startActivity(intentFour);

                }
                else if(i==4){

                    Intent intentFive=new Intent(getApplicationContext(),AboutUs.class);
                    startActivity(intentFive);

                }

                else if(i==5){

                    Intent intentSix=new Intent(getApplicationContext(),OurAchievement.class);
                    startActivity(intentSix);

                }
                else if(i==6){

                    Intent intentSeven=new Intent(getApplicationContext(),Contact.class);
                    startActivity(intentSeven);

                }


            }
        });

//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Selected chocolateOne",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void ClickMethod(){

        responsiveImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nintent=new Intent(getApplicationContext(),WebDesignDown.class);
                startActivity(nintent);

                //WebDesignFragment webDesignFragment=new WebDesignFragment();
                //=getSupportFragmentManager().beginTransaction().replace(R.id.webddesign_layout_id,webDesignFragment).commit();
            }
        });

        BoostSaleImageBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SEOdown.class);
                startActivity(intent);
            }
        });

        EcommerceIMGBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),EcommerceDown.class);
                startActivity(intent);
            }
        });

        SupportIMGBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Contact.class);
                startActivity(intent);
            }
        });

        //Fragment fragment=CustomF

    }
}
