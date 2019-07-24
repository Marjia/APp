package com.terrestrialit.ltd.terrestrialit;

import android.content.Intent;
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

public class AppsDevelopmentFragment extends Fragment {

    View view;

    public AppsDevelopmentFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.app_development_fragment,container,false);
        MakeAnimationMathod();
        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(view,getContext());
        socialMediaCickFragmentClass.SocialMediaClickMethod();
        ClickToSubmitQuateMethod();
        return view;
    }

    public void ClickToSubmitQuateMethod() {
        TextView txt=(TextView)view.findViewById(R.id.submit_quate_txt_id);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),SubmitAQuateActivity.class);
                startActivity(intent);
            }
        });
    }
    public void MakeAnimationMathod(){


        TextView title = (TextView) view.findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
        title.setText(R.string.apps_development);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
