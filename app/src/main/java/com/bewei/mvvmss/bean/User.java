package com.bewei.mvvmss.bean;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/10/9 13:32
 */


public class User {

    private String name;
    private int age;
    private String url;

    public User() {
    }

    public User(String name, int age, String url) {
        this.name = name;
        this.age = age;
        this.url = url;
    }

    @BindingAdapter("bind:url")
    public static void getIntnetImage(ImageView iv, String url) {
        Picasso.with(iv.getContext()).load(url).into(iv);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String userface) {
        this.url = userface;
    }
}
