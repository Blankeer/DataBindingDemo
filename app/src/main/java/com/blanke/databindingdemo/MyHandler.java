package com.blanke.databindingdemo;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
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
    @BindingAdapter(value = {"btext"}, requireAll = false)
    public static void setxxxBText(Button button, String text) {
        button.setText("Button : " + text);
    }

    @BindingConversion
    public static Drawable getDrawableById(String color) {
        return new ColorDrawable(Color.parseColor(color));
    }

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
