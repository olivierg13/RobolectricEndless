package com.example.robolectricendless;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    public static final String TAG_FRAGMENT = MainActivityFragment.class.getSimpleName();

    @AfterViews
    protected void onAfterViews() {
        initFragment();
    }

    private void initFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        // If the Fragment is non-null, then it is currently being
        // retained across a configuration change.
        if (fragmentManager.findFragmentByTag(TAG_FRAGMENT) == null) {
            fragmentManager.beginTransaction().add(R.id.fragment, MainActivityFragment_.builder().build(), TAG_FRAGMENT).commit();
        }
    }
}
