package com.thoughtworks.impl;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class ImplTest {

    @Test
    public void should_return_a_view() throws Exception {
        Context context = Robolectric.setupActivity(Activity.class);

        TextView view = (TextView) new Impl(context).getView();

        assertThat(view.getText().toString(), is("hello"));
    }
}
