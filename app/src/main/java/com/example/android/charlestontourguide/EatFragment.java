package com.example.android.charlestontourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.halls), getString(R.string.halls_address), getString(R.string.halls_phone), getString(R.string.halls_website), R.drawable.halls, getString(R.string.halls_info)));
        items.add(new Item(getString(R.string.fig), getString(R.string.fig_address), getString(R.string.fig_phone), getString(R.string.fig_website), R.drawable.fig, getString(R.string.fig_info)));
        items.add(new Item(getString(R.string.mccradys), getString(R.string.mccradys_address), getString(R.string.mccradys_phone), getString(R.string.mccradys_website), R.drawable.mccradys, getString(R.string.mccradys_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}