package com.example.tailoring.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tailoring.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentHome extends Fragment {
    FloatingActionButton m_fab;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.l_frg_home,container,false);

        return v;
    }
}
