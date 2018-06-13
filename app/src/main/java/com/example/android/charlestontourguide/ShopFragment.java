package com.example.android.charlestontourguide;

import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item("Charleston Farmers Market", "Marion Square\n329 Meeting Street\nCharleston, SC", "(843) 509-3619", "www.charlestonfarmersmarket.com", R.drawable.farmers, "The CFM is dedicated to the support and advocacy of Lowcountry farmers, growers, prepared/packaged food, artisans, crafters, live performers and community groups of all kinds. We offer a variety of local produce, plants, herbs and cut flowers as well as breakfast and lunch vendors, live entertainment and an assortment of juried arts and crafts from local artisans."));
        items.add(new Item("Historic City Market", "188 Meeting Street\nCharleston, SC", "(843) 937-0920", "www.thecharlestoncitymarket.com", R.drawable.market, "The Charleston City Market is one of the nation's oldest public markets and the cultural heart of Charleston. We are home to more than 300 vibrant entrepreneurs, and we are open every day of the year except December 25th. No matter what time of day or season you plan to visit, there is something to see, do, taste, and take home as a souvenir from the Charleston City Market!"));
        items.add(new Item("Shops at Charleston Place", "205 Meeting Street\nCharleston, SC 29401", "(888) 722-4900", "www.charlestonplaceshops.com", R.drawable.shops, "From L'Occitane to Louis Vuitton, The Shops at Belmond Charleston Place are an exclusive collection of world-famous stores nestled in the heart of Charleston's downtown shopping district. There's something for everyone. Go ahead and treat yourself."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}