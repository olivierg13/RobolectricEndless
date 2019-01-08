package com.example;

import com.example.robolectricendless.MainActivity_;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import androidx.test.core.app.ActivityScenario;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21)
public class SpinnerActivityScenarioTest {

    @Test
    public void shouldNotRunEndless() {
        ActivityScenario.launch(MainActivity_.class);
    }
}
