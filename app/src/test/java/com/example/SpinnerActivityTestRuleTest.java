package com.example;

import com.example.robolectricendless.MainActivity_;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import androidx.test.core.app.ActivityScenario;
import androidx.test.rule.ActivityTestRule;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21)
public class SpinnerActivityTestRuleTest {

    @Test
    public void shouldNotRunEndless() {
        new ActivityTestRule<>(MainActivity_.class).launchActivity(null);
    }
}
