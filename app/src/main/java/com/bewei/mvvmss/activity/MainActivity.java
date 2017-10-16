package com.bewei.mvvmss.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bewei.mvvmss.R;
import com.bewei.mvvmss.bean.News;
import com.bewei.mvvmss.bean.User;
import com.bewei.mvvmss.databinding.ActivityMainBinding;
import com.bewei.mvvmss.utils.GsonArrayCallback;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setUser(new User("张三", 30, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507540241932&di=b3c2bc2507c5df95c2a117fd012f6bb0&imgtype=0&src=http%3A%2F%2Fh.hiphotos.baidu.com%2Fzhidao%2Fwh%253D450%252C600%2Fsign%3D65d49821a70f4bfb8c859650367f54c6%2Fcdbf6c81800a19d85be873bb30fa828ba71e46a1.jpg"));
    }

}
