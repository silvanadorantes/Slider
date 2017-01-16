package com.example.silvanadorantes.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SliderDosFragment extends Fragment {


    public SliderDosFragment() {
        // Required empty public constructor
    }

    public static SliderDosFragment newInstance(){
        SliderDosFragment fragment = new SliderDosFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_slider_dos, container, false);
    }

}
