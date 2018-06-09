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

        items.add(new Item("Halls Chophouse", "434 King Street", "(843) 727-0090", "www.hallschophouse.com", R.drawable.halls, "Halls. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a luctus elit, sit amet congue sem. Vivamus dignissim fermentum ligula, id pharetra dui elementum id. Pellentesque suscipit, mauris non ornare pretium, orci orci rutrum neque, ac semper tellus sapien ac neque. Quisque varius libero eu ante lacinia cursus."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;    }

}