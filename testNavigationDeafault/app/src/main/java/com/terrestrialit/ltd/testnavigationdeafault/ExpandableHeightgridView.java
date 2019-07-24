package com.terrestrialit.ltd.testnavigationdeafault;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;

public class ExpandableHeightgridView extends GridView {


    boolean expanded = false;

    public ExpandableHeightgridView(Context context) {
        super(context);
    }


    public ExpandableHeightgridView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ExpandableHeightgridView(Context context, AttributeSet attrs,
                                    int defStyle)
    {
        super(context, attrs, defStyle);
    }

    public boolean isExpanded()
    {
        return expanded;
    }
//
//    @Override
//    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
//    {
//        // HACK! TAKE THAT ANDROID!
//        if (isExpanded())
//        {
//            // Calculate entire height by providing a very large height hint.
//            // View.MEASURED_SIZE_MASK represents the largest height possible.
//            int expandSpec = MeasureSpec.makeMeasureSpec(
//                    Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
//            super.onMeasure(widthMeasureSpec, expandSpec);
//
//            ViewGroup.LayoutParams params = getLayoutParams();
//            params.height = getMeasuredHeight();
//        }
//        else
//        {
//            super.onMeasure(widthMeasureSpec, MeasureSpec.UNSPECIFIED);
//        }
//    }


//    @Override
//    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST));
//        getLayoutParams().height = getMeasuredHeight();
//    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSpec;

        if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {

            heightSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        }
        else {
            // Any other height should be respected as is.
            heightSpec = heightMeasureSpec;
        }

        super.onMeasure(widthMeasureSpec, heightSpec);
    }


    public void setExpanded(boolean expanded)
    {
        this.expanded = expanded;
    }

}
