package com.example.telim2.gmv1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.telim2.gmv1.R;

/**
 * Created by galqayeva on 21.08.2017.
 */

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view1=inflater.inflate(R.layout.fragment1,container,false);
        return view1;

    }
}
