package com.example.android.mytour;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisneylandFragment extends Fragment {


    public DisneylandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.activity_disneyland, container, false);

        final ArrayList<Ride> rides = new ArrayList<Ride>();


        rides.add(new Ride("Big Thunder", "Dash in and out of craggy caverns and rumble through an old mine.",
                R.drawable.disney_big_thunder));
        rides.add(new Ride("Matterhorn", "Careen through a snow-capped mountain on a speeding alpine sled.",
                R.drawable.disney_matterhorn));
        rides.add(new Ride("Space Mountain", "Blast off on a speeding rocket through outer space.",
                R.drawable.disney_space_mountain));
        rides.add(new Ride("Travel Ling Go", "Embark on a rollicking log flume ride",
                R.drawable.disney_travelinggo));



        ListView listView = (ListView) rootView.findViewById(R.id.list);

        RideAdapter adapter = new RideAdapter(getActivity(), rides, R.color.category_disneyland);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

            }
        });

        return rootView;

    }

 }