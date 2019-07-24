package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Education_Adapter extends BaseAdapter {

    private Context context;
    private String[] degree_ad,uni_ad,duration_ad;


    public Education_Adapter(Context context, String[] degree_ad, String[] uni_ad, String[] duration_ad) {
        this.context = context;
        this.degree_ad = degree_ad;
        this.uni_ad = uni_ad;
        this.duration_ad = duration_ad;
    }

    @Override
    public int getCount() {
        return uni_ad.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {

        View row;

        final TextView degreeTXT,universityTXT,durationTXT;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row=inflater.inflate(R.layout.grid_view_list_education_item,parent,false);

        //row.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT,));

        degreeTXT = (TextView) row.findViewById(R.id.degree_name_txt_id);
        universityTXT = (TextView) row.findViewById(R.id.university_name_txt_id);
        durationTXT=(TextView)row.findViewById(R.id.duration_txt_id);


        degreeTXT.setText(degree_ad[position]);
        universityTXT.setText(uni_ad[position]);
        durationTXT.setText(duration_ad[position]);
        return row;

    }
}
