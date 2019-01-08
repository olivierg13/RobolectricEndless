package com.example;

import com.example.robolectricendless.MainActivity_;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21)
public class SpinnerTest {

    @Test
    public void shouldNotRunEndless() {
        Robolectric.buildActivity(MainActivity_.class).setup();
    }
}
