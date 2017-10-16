package com.bewei.mvvmss.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bewei.mvvmss.BR;
import com.bewei.mvvmss.bean.News;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/10/9 15:51
 */


public class MyAdapter extends BaseAdapter {
    Context context;
    News news;
    int item;

    public MyAdapter(Context context, News news, int item) {
        this.context = context;
        this.news = news;
        this.item = item;
    }



    @Override
    public int getCount() {
        return news.getResults().size();
    }

    @Override
    public Object getItem(int i) {
        return news.getResults().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //加载布局
        ViewDataBinding viewDataBinding = null;
        if (view == null) {
            viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), item, viewGroup, false);

        } else {
            viewDataBinding = DataBindingUtil.getBinding(view);
        }
        //设置数据
        viewDataBinding.setVariable(BR.results, news.getResults().get(i));
        //返回视图
        return viewDataBinding.getRoot();
    }
}
