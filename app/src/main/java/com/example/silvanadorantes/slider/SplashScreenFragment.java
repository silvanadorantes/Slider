package com.example.silvanadorantes.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashScreenFragment extends Fragment {


    public SplashScreenFragment() {
        // Required empty public constructor
    }

    public static SplashScreenFragment newInstance(){
        SplashScreenFragment fragment = new SplashScreenFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }

}
