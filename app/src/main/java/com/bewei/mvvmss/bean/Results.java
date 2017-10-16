package com.bewei.mvvmss.bean;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bewei.mvvmss.R;
import com.squareup.picasso.Picasso;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/10/9 15:33
 */


public class Results {

    private String type;
    private String url;

    public Results(String type, String url) {
        this.type = type;
        this.url = url;
    }

    @BindingAdapter("bind:url")
    public static void getImage(ImageView iv, String url) {
        Picasso.with(iv.getContext()).load(url).placeholder(R.mipmap.ic_launcher).into(iv);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //点击条目
    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "点击条目", Toast.LENGTH_SHORT).show();
    }
}
