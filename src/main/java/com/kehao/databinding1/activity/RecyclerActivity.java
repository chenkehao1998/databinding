package com.kehao.databinding1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.kehao.databinding1.R;
import com.kehao.databinding1.adapter.MyRecyclerViewAdapter;
import com.kehao.databinding1.bean.UserBean;
import com.kehao.databinding1.databinding.ActivityRecyclerBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private ActivityRecyclerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycler);
        RecyclerView recyclerView = binding.recyclerview;
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter();
        adapter.list = new ArrayList<UserBean>();
        initList(adapter.list);
        adapter.fun = ()-> Toast.makeText(this, "you touch it", Toast.LENGTH_SHORT).show();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(RecyclerActivity.this);
        manager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(manager);
    }

    private void initList(List<UserBean> list){
        for (int i = 0 ;i<10 ;i++){
            list.add(new UserBean("李"+i,i));
        }


    }
}
