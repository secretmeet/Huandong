package com.ecut.huandong.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecut.huandong.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommunityCityFragment extends Fragment {


    public CommunityCityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_community_city, container, false);
    }

}