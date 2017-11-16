package com.blanke.databindingdemo;

import android.databinding.ObservableField;

/**
 * Created by blanke on 2017/11/16.
 */

public class News {
    // 只追踪某个变量的修改,引起视图刷新
    private ObservableField<String> content=new ObservableField<>();
    private String title;

    public News(String title, String content) {
        this.content.set(content);
        this.title = title;
    }

    public ObservableField<String> getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content.set(content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
