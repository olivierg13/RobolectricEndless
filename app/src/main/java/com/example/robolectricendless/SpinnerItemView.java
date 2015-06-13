package com.example.robolectricendless;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.view_spinner_item)
public class SpinnerItemView extends RelativeLayout{

    @ViewById(android.R.id.text1)
    public TextView textView;

    public SpinnerItemView(Context context) {
        super(context);
    }
}
