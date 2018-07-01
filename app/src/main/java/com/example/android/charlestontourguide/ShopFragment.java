package com.example.android.charlestontourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item(getString(R.string.farmers), getString(R.string.farmers_address), getString(R.string.farmers_phone), getString(R.string.farmers_website), R.drawable.farmers, getString(R.string.farmers_info)));
        items.add(new Item(getString(R.string.market), getString(R.string.market_address), getString(R.string.market_phone), getString(R.string.market_website), R.drawable.market, getString(R.string.market_info)));
        items.add(new Item(getString(R.string.shops), getString(R.string.shops_address), getString(R.string.shops_phone), getString(R.string.shops_website), R.drawable.shops, getString(R.string.shops_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}