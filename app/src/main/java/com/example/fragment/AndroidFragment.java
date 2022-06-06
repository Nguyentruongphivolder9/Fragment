package com.example.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class AndroidFragment extends Fragment {

    RelativeLayout relativeLayout;
    TextView tvTitle;
    View view;
    Random random;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android, container, false);
        relativeLayout = view.findViewById(R.id.relative_android);
        tvTitle = view.findViewById(R.id.text_view_android_fragment);
        random = new Random();
        relativeLayout.setBackgroundColor(Color.rgb(random.nextInt() + 1,random.nextInt() + 1,random.nextInt() + 1));
        return view;
    }

}
