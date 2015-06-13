package com.example.robolectricendless;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;

@EFragment(R.layout.fragment_main)
public class MainActivityFragment extends Fragment {

    @AfterViews
    public void onAfterViews() {
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.view_spinner_item, android.R.id.text1);

        // switch both following lines and test will not run endless.
        ((Spinner)getActivity().findViewById(R.id.interval)).setAdapter(stringArrayAdapter);
        stringArrayAdapter.addAll("one,", "two");

        ((Spinner)getActivity().findViewById(R.id.category)).setAdapter(new SpinnerAdapter(getActivity()));
    }

    // remove this select listener and test will not run endless
    @ItemSelect(R.id.interval)
    public void onSelect(boolean selected, int position) {

    }
}
