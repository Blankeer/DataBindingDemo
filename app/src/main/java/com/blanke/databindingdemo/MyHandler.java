package com.blanke.databindingdemo;

import android.view.View;
import android.widget.Toast;

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
}
