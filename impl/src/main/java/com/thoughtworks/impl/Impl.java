package com.thoughtworks.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.thoughtworks.api.Api;

public class Impl implements Api{
    private Context context;

    public Impl(Context context) {
        this.context = context;
    }

    @Override
    public View getView() {
        TextView textView = new TextView(context);
        textView.setText("hello");
        return textView;
    }
}
