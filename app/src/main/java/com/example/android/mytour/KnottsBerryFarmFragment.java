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
public class KnottsBerryFarmFragment extends Fragment {


    public KnottsBerryFarmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_knotts_berry_farm, container, false);

        final ArrayList<Ride> rides = new ArrayList<Ride>();
        //words.add("one");

        rides.add(new Ride("Boomerang", "Dash in and out of craggy caverns and rumble through an old mine.",
                R.drawable.knotts__boomerang));
        rides.add(new Ride("Sidewinder", "Careen through a snow-capped mountain on a speeding alpine sled.",
                R.drawable.knotts__sidewinder));
        rides.add(new Ride("Xcelerator", "Blast off on a speeding rocket through outer space.",
                R.drawable.knotts__xcelerator));
        rides.add(new Ride("Silverbullet", "Embark on a rollicking log flume ride",
                R.drawable.knotts_berry__silverbullet));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        RideAdapter adapter = new RideAdapter(getActivity(), rides, R.color.category_knotts_berry_farm);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Ride ride = rides.get(position);


            }
        });

        return rootView;

    }


}



