package com.tabbedcollapseview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;


public class TabFragment extends Fragment {

    RecyclerListAdapter  mListAdapter;

    private String mListData = "Spartan what is your profession? guess answer? it is building open source community";

    public TabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(
                R.id.fragment_rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        String[] listItems = mListData.split(" ");

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, listItems);

        mListAdapter = new RecyclerListAdapter(list);
        recyclerView.setAdapter(mListAdapter);

        return view;
    }

}
