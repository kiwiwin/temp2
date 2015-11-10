package com.thoughtworks.my_camera;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MyTest {

    @Test
    public void should_say_hello() throws Exception {
        MainActivity main = Robolectric.setupActivity(MainActivity.class);

        TextView hello = (TextView) main.findViewById(R.id.hello);

        assertThat(hello.getText().toString(), is("Hello world!"));
    }
}
