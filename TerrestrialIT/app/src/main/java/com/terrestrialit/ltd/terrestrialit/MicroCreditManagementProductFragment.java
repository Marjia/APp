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

public class MicroCreditManagementProductFragment extends Fragment {

    View view;

    public MicroCreditManagementProductFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.micro_credit_management_system_product_fragment,container,false);
        SocialMediaCickFragmentClass socialMediaCickFragmentClass=new SocialMediaCickFragmentClass(view,getContext());
        socialMediaCickFragmentClass.SocialMediaClickMethod();
        MakeAnimationMethod();
        ClickToRequestForDemoMethod();
        return view;
    }
    public void ClickToRequestForDemoMethod() {
        TextView txt=(TextView)view.findViewById(R.id.submit_quate_txt_id);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),RequestForDemoActivity.class);
                startActivity(intent);
            }
        });
    }
    public void MakeAnimationMethod(){


        TextView title = (TextView) view.findViewById(R.id.txtTitle);
        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scaleanimation);
        title.setText(R.string.micro_credit_management_system_product);
        scaleAnimation.setRepeatMode(Animation.RESTART);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        title.startAnimation(scaleAnimation);
    }
}
