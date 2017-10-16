package com.bewei.mvvmss.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.bewei.mvvmss.R;
import com.bewei.mvvmss.adapter.MyAdapter;
import com.bewei.mvvmss.bean.News;
import com.bewei.mvvmss.utils.GsonArrayCallback;
import com.bewei.mvvmss.utils.GsonObjectCallback;
import com.bewei.mvvmss.utils.OkHttp3Utils;

import java.io.IOException;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/10/9 15:18
 */


public class OtherActivity extends AppCompatActivity {
    String url = "http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1";


    @Bind(R.id.lv)
    ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        //一键生成
        ButterKnife.bind(this);
        //获取数据
        initData();

    }

    private void initData() {

        OkHttp3Utils.getInstance().doGet(url, new GsonObjectCallback<News>() {
            @Override
            public void onUi(News news) {
                //直接回调到主线程
                MyAdapter adapter = new MyAdapter(OtherActivity.this,news,R.layout.item);
                lv.setAdapter(adapter);
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });


    }
}
