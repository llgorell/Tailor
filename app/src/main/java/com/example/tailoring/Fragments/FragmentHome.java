package com.example.tailoring.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.tailoring.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentHome extends Fragment {
    FloatingActionButton m_fab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.l_frg_home, container, false);

        m_fab = v.findViewById(R.id.floatingActionButton);

        //onClick flotingActionBar
        m_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.frameContainer, new FragmentAddPerson());
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        return v;
    }
}
