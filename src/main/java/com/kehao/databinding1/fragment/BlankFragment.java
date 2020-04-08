package com.kehao.databinding1.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kehao.databinding1.R;
import com.kehao.databinding1.bean.UserBean;
import com.kehao.databinding1.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    public BlankFragment() {
        // Required empty public constructor
    }


     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /* 用DataBinding之前
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        return view;
        */

        //使用之后
        binding = FragmentBlankBinding.inflate(inflater);
        UserBean user = new UserBean("张三",11);
        binding.setUser(user);
        return binding.getRoot();
    }


}
