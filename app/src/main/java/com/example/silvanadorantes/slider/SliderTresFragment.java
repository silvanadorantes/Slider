package com.example.silvanadorantes.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SliderTresFragment extends Fragment {


    public SliderTresFragment() {
        // Required empty public constructor
    }

    public static SliderTresFragment newInstance(){
        SliderTresFragment fragment = new SliderTresFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_slider_tres, container, false);
    }

}
