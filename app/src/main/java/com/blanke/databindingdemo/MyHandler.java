package com.blanke.databindingdemo;

import android.view.View;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by blanke on 2017/11/16.
 */

public class MyHandler {
    public void clickTitle(View view) {
        Toast.makeText(view.getContext(), "click title", Toast.LENGTH_SHORT).show();
    }

    public void clickContent(View view, News news) {
        Toast.makeText(view.getContext(), news.getContent(), Toast.LENGTH_SHORT).show();
    }

    public void clickButton(View view, News news) {
//        Toast.makeText(view.getContext(), "click button ,news=" + news, Toast.LENGTH_SHORT).show();
        Random random = new Random();
        news.setTitle("title " + random.nextInt(100) );
        news.setContent("content " + random.nextInt(100) );
    }
}
