package com.example.android.charlestontourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.lighthouse), getString(R.string.lighthouse_address), getString(R.string.lighthouse_phone), getString(R.string.lighthouse_website), R.drawable.lighthouse, getString(R.string.lighthouse_info)));
        items.add(new Item(getString(R.string.waterfront), getString(R.string.waterfront_address), getString(R.string.waterfront_phone), getString(R.string.waterfront_website), R.drawable.waterfront, getString(R.string.waterfront_info)));
        items.add(new Item(getString(R.string.aquarium), getString(R.string.aquarium_address), getString(R.string.aquarium_phone), getString(R.string.aquarium_website), R.drawable.aquarium, getString(R.string.aquarium_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}