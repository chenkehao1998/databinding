package com.kehao.databinding1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.kehao.databinding1.activity.FragmentActivity;
import com.kehao.databinding1.activity.RecyclerActivity;
import com.kehao.databinding1.bean.UserBean;
import com.kehao.databinding1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserBean bean = new UserBean("李明",20);
        binding.setUser(bean);
        //setContentView(R.layout.activity_main);
        bean.setAge(200);
    }

    public void toFragment(View view) {
        Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(intent);
    }

    public void toRecycler(View view) {
        Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
        startActivity(intent);
    }
}
