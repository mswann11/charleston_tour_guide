package com.example.android.charlestontourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TourFragment extends Fragment {


    public TourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.carriage), getString(R.string.carriage_address), getString(R.string.carriage_phone), getString(R.string.carriage_website), R.drawable.carriage, getString(R.string.carriage_info)));
        items.add(new Item(getString(R.string.culinary), getString(R.string.culinary_address), getString(R.string.culinary_phone), getString(R.string.culinary_website), R.drawable.culinary, getString(R.string.culinary_info)));
        items.add(new Item(getString(R.string.ghost), getString(R.string.ghost_address), getString(R.string.ghost_phone), getString(R.string.ghost_website), R.drawable.ghosts, getString(R.string.ghost_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}