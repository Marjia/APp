package com.terrestrialit.ltd.terrestrialit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] menuTitle;
    private int[] image;

    public CustomAdapter(Context context, String[] menuTitle, int[] image) {
        this.context = context;
        this.menuTitle = menuTitle;
        this.image = image;
    }

    public int getCount() {

        return menuTitle.length;
    }

    public Object getItem(int arg0) {

        return null;
    }

    public long getItemId(int position) {

        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row;

        final TextView title;
        row = inflater.inflate(R.layout.list_item_row, parent, false);
            ImageView i1;
            i1 = (ImageView) row.findViewById(R.id.img_icon);
            title = (TextView) row.findViewById(R.id.title_id);
            title.setText(menuTitle[position]);
            i1.setImageResource(image[position]);




        return (row);
    }


}
