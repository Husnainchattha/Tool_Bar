package com.example.hussnain.tool_bar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hussnain on 3/16/18.
 */

public class FirstFragment extends Fragment {
    private String title;
    private int page;
public static FirstFragment newInstance(int page,String title){
    FirstFragment firstFragment=new FirstFragment();
    Bundle args=new Bundle();
    firstFragment.setArguments(args);
    firstFragment.title=title;
    firstFragment.page=page;
    return firstFragment;
}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);
        return view;
}
}
