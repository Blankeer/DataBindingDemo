package com.blanke.databindingdemo;

import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by blanke on 2017/11/16.
 */
@BindingMethods({
        @BindingMethod(type = TextView.class,
                attribute = "android:textColor",
                method = "setText"),
        @BindingMethod(type = TextView.class,
                attribute = "xtext",
                method = "setText"),
})
public class MyHandler {
    public void clickTitle(View view) {
        Toast.makeText(view.getContext(), "click title", Toast.LENGTH_SHORT).show();
    }

    public void clickContent(View view, News news) {
        Toast.makeText(view.getContext(), news.getContent(), Toast.LENGTH_SHORT).show();
    }

    public void clickButton(View view, News news) {
//        Toast.makeText(view.getContext(), "click button ,news=" + news.getContent(), Toast.LENGTH_SHORT).show();
        Random random = new Random();
        news.setTitle("title " + random.nextInt(100));
        news.setContent("content " + random.nextInt(100));
    }
}
