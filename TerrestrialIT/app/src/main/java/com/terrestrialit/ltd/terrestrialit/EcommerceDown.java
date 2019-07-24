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

public class EcommerceDown extends ToolbarClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce_down);

        String title="Ecommerce Solution";
        ToolbarMethod(title);
        SocialMediaClickMethod();

        MakeAnimationMathod();
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
                    builder = new AlertDialog.Builder(EcommerceDown.this);
                } else {
                    builder = new AlertDialog.Builder(EcommerceDown.this);
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

    public void MakeAnimationMathod(){


        TextView title = (TextView) findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanimation);
        title.setText(R.string.ecommerce_solution);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
