package com.blanke.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by blanke on 2017/11/16.
 */

public class News extends BaseObservable {
    private String content;
    private String title;

    public News(String title, String content) {
        this.content = content;
        this.title = title;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //当 content 改变时,会自动刷新视图
        notifyPropertyChanged(BR.content);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
}
