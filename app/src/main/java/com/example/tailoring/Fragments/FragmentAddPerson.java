package com.example.tailoring.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tailoring.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FragmentAddPerson extends Fragment {
TextInputLayout textInputLayout;
TextInputEditText textInputEditText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.l_frg_scrl_add_person,container,false);
textInputLayout=v.findViewById(R.id.tl_addprsn_dorekamar);
        textInputEditText=v.findViewById(R.id.et_addprsn_name);
        textInputEditText.setText("asdasd");

        return v;
    }
}
