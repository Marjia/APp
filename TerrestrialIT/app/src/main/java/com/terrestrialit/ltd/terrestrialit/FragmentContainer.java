package com.terrestrialit.ltd.terrestrialit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by marzia on 9/13/2017.
 */

public class FragmentContainer extends Fragment {

    View view;


    public FragmentContainer() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_container,container,false);
//        MakeAnimationMathod();
//        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(view,getContext());
//        socialMediaCickFragmentClass.SocialMediaClickMethod();
//        //SocialMediaClickMethod();
        return view;
    }

//    public void MakeAnimationMathod(){
//
//
//        TextView title = (TextView) view.findViewById(R.id.txtTitle);
//        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
//        title.setText(R.string.about_us);
//        scaleAnimation.setRepeatMode(Animation.RESTART);
//        scaleAnimation.setRepeatCount(Animation.INFINITE);
//        title.startAnimation(scaleAnimation);
//    }

//    public void SocialMediaClickMethod() {
//        ImageView Fb,Twit,Googleplus,Linkedin,Skype;
//
//        Fb=(ImageView)view.findViewById(R.id.facebook_id);
//        Twit=(ImageView)view.findViewById(R.id.twitter_id);
//        Googleplus=(ImageView)view.findViewById(R.id.googleplus);
//        Linkedin=(ImageView)view.findViewById(R.id.linkedin_id);
//        Skype=(ImageView)view.findViewById(R.id.skype_id);
//
//
//        Fb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri = Uri.parse("https://www.facebook.com/TerrestrialIT/"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
//
//        Twit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri uri = Uri.parse("https://twitter.com/terrestrialit"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//
//
//            }
//        });
//        Googleplus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri uri = Uri.parse("https://plus.google.com/+terrestrialit"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//
//
//            }
//        });
//
//        Linkedin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri uri = Uri.parse("https://www.linkedin.com/company/terrestrial-it"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//
//
//            }
//        });
//
//        Skype.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Uri uri = Uri.parse("skype:terrestrialit?call"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//
//
//            }
//        });
//    }

}
