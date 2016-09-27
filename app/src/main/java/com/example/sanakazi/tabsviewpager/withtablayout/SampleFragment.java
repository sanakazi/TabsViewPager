package com.example.sanakazi.tabsviewpager.withtablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sanakazi.tabsviewpager.R;

/**
 * Created by SanaKazi on 9/27/2016.
 */
public class SampleFragment extends Fragment {
    TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sample_fragment, container, false);
        txt = (TextView)v.findViewById(R.id.txt);
      //  txt.setText();

        return v;
    }
}
