package com.blanke.databindingdemo;

/**
 * Created by blanke on 2017/11/16.
 */

public class News {
    private String content;
    private String title;

    public News(String title, String content) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
