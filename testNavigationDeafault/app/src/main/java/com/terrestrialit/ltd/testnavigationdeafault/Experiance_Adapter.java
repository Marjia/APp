package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Experiance_Adapter extends BaseAdapter {

    private Context context;
    private String[] designation_ad,company_name_ad,dutie_ad,duration_exp_ad;


    public Experiance_Adapter(Context context, String[] designation_ad, String[] company_name_ad, String[] dutie_ad,String[] duration_exp_ad) {
        this.context = context;
        this.designation_ad = designation_ad;
        this.company_name_ad = company_name_ad;
        this.dutie_ad = dutie_ad;
        this.duration_exp_ad = duration_exp_ad;
    }




    @Override
    public int getCount() {
        return designation_ad.length;
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

        final TextView designationTXT,companyNameTXT,dutieTXT,durationEXpTXT;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row=inflater.inflate(R.layout.grid_view_list_experiance_item,parent,false);

        //row.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT,));

        designationTXT = (TextView) row.findViewById(R.id.designation_exp_name_txt_id);
        companyNameTXT = (TextView) row.findViewById(R.id.company_name_exp_txt_id);
        dutieTXT=(TextView)row.findViewById(R.id.duties_exp_txt_id);
        durationEXpTXT=(TextView)row.findViewById(R.id.duration_exp_txt_id);


        designationTXT.setText(designation_ad[position]);
        companyNameTXT.setText(company_name_ad[position]);
        dutieTXT.setText(dutie_ad[position]);
        durationEXpTXT.setText(duration_exp_ad[position]);
        return row;

    }
}
