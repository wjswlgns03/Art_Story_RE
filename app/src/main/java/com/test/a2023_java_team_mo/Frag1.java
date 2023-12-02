package com.test.a2023_java_team_mo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {
    private View view;

    // test 2
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);
        return view;
    }
}