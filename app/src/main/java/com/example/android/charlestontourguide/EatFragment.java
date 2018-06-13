package com.example.android.charlestontourguide;

import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item("Halls Chophouse", "434 King Street\nCharleston, SC", "(843) 727-0090", "www.hallschophouse.com", R.drawable.halls, "Halls Chophouse is a family steakhouse restaurant located in the Upper King District of Charleston. As a premier steakhouse they use the finest freshest USDA prime steaks and meat. Vegan and vegetarian dishes are specially made upon request. Halls Chophouse also provides gluten free menu options and fresh sustainable local seafood dishes."));
        items.add(new Item("FIG", "232 Meeting Street\nCharleston, SC", "(843) 805-5900", "www.eatatfig.com", R.drawable.fig, "At the core, FIG’s menu is a labor of love. We source products with integrity, flavor and soul, and incorporate these seasonal offerings into our menu nightly. The result is food that is honest, straightforward and pays homage to the Lowcountry, a special place we are privileged to call home. "));
        items.add(new Item("McCrady's", "155 East Bay Street\nCharleston, SC", "(843) 577-0025", "www.mccradysrestaurant.com", R.drawable.mccradys, "McCrady’s is a tasting menu-only restaurant helmed by James Beard Award winning Chef Sean Brock. The 22-seat space, located in historic downtown Charleston, features exceptional hospitality and an open kitchen creating an intimate and adventurous dining experience at South Carolina’s only AAA five diamond awarded restaurant."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;    }

}