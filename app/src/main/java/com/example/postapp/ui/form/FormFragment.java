package com.example.postapp.ui.form;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.postapp.databinding.FragmentFormBinding;

public class FormFragment extends Fragment {

    private FragmentFormBinding binding;

 public FormFragment() {
        // Required empty public constructor
    }

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     binding = FragmentFormBinding.inflate(inflater,container, false);
     return  binding.getRoot();
    }
}