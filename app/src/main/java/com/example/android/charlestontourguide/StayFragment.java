package com.example.android.charlestontourguide;

import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item("Francis Marion Hotel", "387 King Street\nCharleston, SC", "(843) 722-0600", "www.francismarionhotel.com", R.drawable.francis, "Built in 1924 and meticulously restored, The Francis Marion Hotel features 1920's styled décor and comforting amenities. Diners can dig into a plate of shrimp, grits, and other Southern delights at The Swamp Fox Restaurant & Bar. Guests can work out at the fitness center, and drop by Spa Adagio for a massage, facial, mud wrap, and one of the other therapeutic treatments on offer."));
        items.add(new Item("Market Pavilion Hotel", "225 East Bay Street\nCharleston, SC", "(843) 723-0500", "www.marketpavilion.com", R.drawable.pavilion, "Located in the heart of Charleston, this family-friendly hotel is within walking distance of many top and historic attractions. Along with 2 restaurants, this smoke-free hotel has an outdoor pool and 2 bars/lounges. Free continental breakfast and free WiFi in public areas are also provided. Additionally, a 24-hour fitness center, a poolside bar, and a rooftop terrace are onsite."));
        items.add(new Item("Wentworth Mansion", "149 Wentworth Street\nCharleston, SC 29401", "(888) 466-1886", "www.wentworthmansion.com", R.drawable.wentworth, "A full-service spa, a restaurant, and a bar/lounge are available at this hotel. Free cooked-to-order breakfast is provided, as well as free WiFi in public areas. Other amenities include a rooftop terrace and massage/treatment rooms. All 21 individually decorated rooms feature free WiFi and iPod docks. In addition to upscale touches like fireplaces and jetted tubs, guests will find flat-screen TVs with cable channels and refrigerators."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}