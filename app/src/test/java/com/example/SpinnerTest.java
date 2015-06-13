package com.example;

import com.example.robolectricendless.BuildConfig;
import com.example.robolectricendless.MainActivity_;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class SpinnerTest {

    @Test
    public void shouldNotRunEndless() {
        Robolectric.buildActivity(MainActivity_.class).setup();
    }
}
