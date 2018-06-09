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

        items.add(new Item("Francis Marion Hotel", "387 King Street", "(843) 722-0600", "www.francismarionhotel.com", R.drawable.francis, "Francis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a luctus elit, sit amet congue sem. Vivamus dignissim fermentum ligula, id pharetra dui elementum id. Pellentesque suscipit, mauris non ornare pretium, orci orci rutrum neque, ac semper tellus sapien ac neque. Quisque varius libero eu ante lacinia cursus."));
        items.add(new Item("Market Pavilion Hotel", "225 East Bay Street", "(843) 723-0500", "www.marketpavilion.com", R.drawable.pavilion, "Pavilion. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a luctus elit, sit amet congue sem. Vivamus dignissim fermentum ligula, id pharetra dui elementum id. Pellentesque suscipit, mauris non ornare pretium, orci orci rutrum neque, ac semper tellus sapien ac neque. Quisque varius libero eu ante lacinia cursus."));
        items.add(new Item("Wentworth Mansion", "149 Wentworth Street\nCharleston, SC 29401", "(888) 466-1886", "www.wentworthmansion.com", R.drawable.wentworth, "Wentworth. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a luctus elit, sit amet congue sem. Vivamus dignissim fermentum ligula, id pharetra dui elementum id. Pellentesque suscipit, mauris non ornare pretium, orci orci rutrum neque, ac semper tellus sapien ac neque. Quisque varius libero eu ante lacinia cursus."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}