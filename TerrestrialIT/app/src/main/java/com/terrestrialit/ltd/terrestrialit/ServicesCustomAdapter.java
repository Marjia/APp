package com.terrestrialit.ltd.terrestrialit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ServicesCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] ChocolateOneTitleAD;
    private String[] ChocolateOneDetailAD;

    public ServicesCustomAdapter(Context context, String[] chocolateOneTitleAD, String[] chocolateOneDetailAD) {
        this.context = context;
        ChocolateOneTitleAD = chocolateOneTitleAD;
        ChocolateOneDetailAD = chocolateOneDetailAD;
    }

    @Override
    public int getCount() {
        return ChocolateOneTitleAD.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int postion) {
        return postion;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row;

        final TextView title,Detail;
        row = inflater.inflate(R.layout.services_list_item_row, parent, false);
        title=(TextView)row.findViewById(R.id.chocolate_one_title_id);
        Detail=(TextView)row.findViewById(R.id.chocolate_one_passage_id);
        title.setText(ChocolateOneTitleAD[position]);
        Detail.setText(ChocolateOneDetailAD[position]);

        return row;
    }
}
