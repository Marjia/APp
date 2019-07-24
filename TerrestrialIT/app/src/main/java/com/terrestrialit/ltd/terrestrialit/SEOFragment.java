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

public class SEOFragment extends Fragment {

    View view;

    public SEOFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.seo_fragment,container,false);
        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(view,getContext());
        socialMediaCickFragmentClass.SocialMediaClickMethod();
        MakeAnimationMethod();
        ClicktoTraining();
        return view;
    }
    public void ClicktoTraining() {

        TextView applyfortrainingTXT;

        applyfortrainingTXT=(TextView)view.findViewById(R.id.apply_for_training_txt_btn_id);
        applyfortrainingTXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),ApplyOnlineTrainingActivity.class);
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
    public void MakeAnimationMethod(){


        TextView title = (TextView) view.findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
        title.setText(R.string.seo_service);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
