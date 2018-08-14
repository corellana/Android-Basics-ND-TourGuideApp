package com.example.carito.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
* {@link Fragment} that displays a list of places.
*/
public class OutdoorsFragment extends Fragment {

    public OutdoorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Parque Quinta Normal", R.drawable.outdoors_parque_quinta_normal));
        locations.add(new Location("Parque Forestal", R.drawable.outdoors_parque_forestal));
        locations.add(new Location("Parque Araucano", R.drawable.outdoors_parque_araucano));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
