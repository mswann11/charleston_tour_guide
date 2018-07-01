package com.example.android.charlestontourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StayFragment extends Fragment {

    public StayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.francis), getString(R.string.francis_address), getString(R.string.francis_phone), getString(R.string.francis_website), R.drawable.francis, getString(R.string.francis_info)));
        items.add(new Item(getString(R.string.pavilion), getString(R.string.pavilion_address), getString(R.string.pavilion_phone), getString(R.string.pavilion_website), R.drawable.pavilion, getString(R.string.pavilion_info)));
        items.add(new Item(getString(R.string.wentworth), getString(R.string.wentworth_address), getString(R.string.wentworth_phone), getString(R.string.wentworth_website), R.drawable.wentworth, getString(R.string.wentworth_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}