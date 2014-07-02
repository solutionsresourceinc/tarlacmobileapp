package com.visittarlac.tarlacmobileapp;

import com.visittarlac.tarlacmobileapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class PoliceDeptFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	View V = inflater.inflate(R.layout.fragment_policedept, container, false);

        return V;
    }
}