package com.terrestrialit.ltd.terrestrialit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SEOdown extends ToolbarClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seodown);

        String title="SEO";
        ToolbarMethod(title);

        ClicktoTraining();
        SocialMediaClickMethod();
        MakeAnimationMethod();
    }
    public void ClicktoTraining() {

        TextView applyfortrainingTXT;

        applyfortrainingTXT=(TextView)findViewById(R.id.apply_for_training_txt_btn_id);
        applyfortrainingTXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ApplyOnlineTrainingActivity.class);
                startActivity(intent);
//                Fragment applyfragment=new ApplyOnlineTrainingFragment();
//                Fragment adnv=new AdvanceWebDesinignTrainingFragment();
//                FragmentTransaction transaction=getFragmentManager().beginTransaction();
//                transaction.hide(adnv);
//                transaction.replace(R.id.trainingg_fragment_container_id,applyfragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
            }
        });
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
                    builder = new AlertDialog.Builder(SEOdown.this);
                } else {
                    builder = new AlertDialog.Builder(SEOdown.this);
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
    public void MakeAnimationMethod(){


        TextView title = (TextView) findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanimation);
        title.setText(R.string.boost_your_sale);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
