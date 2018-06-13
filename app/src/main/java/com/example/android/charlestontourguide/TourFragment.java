package com.example.android.charlestontourguide;

import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item("Carriage Tour of Historic Charleston", "8 Guignard Street\nCharleston, SC", "(843) 853-6125", "www.palmettocarriage.com", R.drawable.carriage, "Established in 1972, Palmetto Carriage Works is the oldest carriage company in historic Charleston, SC. Still family-owned and operated, the company offers guided horse and mule-drawn tours of Charleston's downtown and and residential historic district for the thousands of visitors hoping to take in the charm and history of the city in a more authentic way."));
        items.add(new Item("Downtown Charleston Culinary Tour", "460 King Street, Suite 200\nCharleston, SC", "(843) 259-2966", "www.charlestonculinarytours.com", R.drawable.culinary, "Charleston Culinary Tours combine the best of Charleston history, cocktails and food with unique tours that highlight the Lowcountry. On each tour, you will not only have an opportunity to sample some of the Lowcountry's finest offerings, but also to meet the owners, chefs and mixologists behind Charleston's impressive culinary and bar innovations."));
        items.add(new Item("Ghost City Tours of Charleston", "1 Vendue Range, Concord Street\nCharleston, SC 29401", "(888) 859-5375", "www.ghostcitytours.com/charleston", R.drawable.ghosts, "Here at Ghost City, we are proud to offer our ghost tours in South Carolina's most haunted city! Our Charleston Ghost Tours take you to the most haunted locations in the downtown area of Charleston. You'll hear the stories of Charleston's haunted history while standing in the very places these haunting events take place."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}