package com.example.android.charlestontourguide;

import android.os.Bundle;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        //Info from TripAdvisor.com
        items.add(new Item("Morris Island Lighthouse Eco-Cruise", "1871 Bowens Island Road\nCharleston, SC", "(843) 795-0330", "www.charlestonoutdooradventures.com", R.drawable.lighthouse, "The uninhabited Morris Island makes a nice contrast to the nearby city of Charleston, but Morris Island isn’t easy to get to, as it’s only accessible by boat. This cruise sets sail from Bowens Island and takes you to Morris Island to spend free time exploring it at your own pace before heading back. Be on the lookout for marine life, such as bottlenose dolphins and sea turtles, from the boat."));
        items.add(new Item("Riley Waterfront Park", "1 Vendue Range, Concord Street\nCharleston, SC", "(843) 724-7327", "www.charlestonparksconservancy.org/park/riley-waterfront-park", R.drawable.waterfront, "Riley Waterfront Park is one of the peninsula's most visited parks, centrally located near The Market. Finished in 1990, Waterfront Park is a favorite of visitors and locals alike, offering fantastic views of the Charleston harbor. Old-fashioned park benches dot the park, and family-sized swings offer a fun way to spend a relaxing afternoon together."));
        items.add(new Item("South Carolina Aquarium", "100 Aquarium Wharf Street\nCharleston, SC", "(843) 577-3474", "www.scaquarium.org/", R.drawable.aquarium, "Fun, wonder and education come together at the South Carolina Aquarium. See a rare albino American alligator, get hands-on at the Touch Tank, marvel at the sharks in the Great Ocean Tank, come face-to-face with rays in the Shallows, or see our brand new state-of-the-art sea turtle hospital in the new Zucker Family Sea Turtle Recovery experience."));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}