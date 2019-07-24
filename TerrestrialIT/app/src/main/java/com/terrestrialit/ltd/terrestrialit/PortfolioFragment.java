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

public class PortfolioFragment extends Fragment {

    View view;

    public PortfolioFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.portfolio_fragment,container,false);
        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(view,getContext());
        socialMediaCickFragmentClass.SocialMediaClickMethod();
        MakeAnimationMathod();
        return view;
    }

    public void MakeAnimationMathod(){


        TextView title = (TextView) view.findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
        title.setText(R.string.portfolio);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
