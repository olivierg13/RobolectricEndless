package com.example.robolectricendless;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class SpinnerAdapter extends BaseAdapter {

    String[] values = {"one", "two", "three"};
    private Context context;

    public SpinnerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int i) {
        return values[i];
    }

    @Override
    public long getItemId(int i) {
        return values[i].hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SpinnerItemView build = SpinnerItemView_.build(context);
        build.textView.setText(values[i]);
        return build;
    }
}
