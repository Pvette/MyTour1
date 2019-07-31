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
public class MagicMountainFragment extends Fragment {


    public MagicMountainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_magic_mountain, container, false);

        final ArrayList<Ride> rides = new ArrayList<Ride>();
        //words.add("one");

        rides.add(new Ride("Batman", "The masked superhero takes you on ride of loops and twists!",
                R.drawable.magic_batman));
        rides.add(new Ride("Goliath", "This hypercoaster includes high-speeds and a 255-ft drop.",
                R.drawable.magic_goliath));
        rides.add(new Ride("Green Lantern", "Steel stand-up roller coaster.",
                R.drawable.magic_greenlantern));
        rides.add(new Ride("Tatsu", "Ride this metal dragon face-down during a set of drops.",
                R.drawable.magic_tatsu));

        RideAdapter adapter = new RideAdapter(getActivity(), rides, R.color.category_magic_mountain);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            //   public void onItemClick(AdapterView<?> adapterView, View view, int position long l) {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ride ride = rides.get(position);


                // Inflate the layout for this fragment
                //return inflater.inflate(R.layout.fragment_disneyland, container, false);
            }
        });

        return rootView;

    }
}
   // @Override

   // public void onStop() {

  //      super.onStop();


        // When the activity is stopped, release the media player resources because we won't

        // be playing any more sounds.

  //  }
//}


    //@Override
  //  public View onCreateView(LayoutInflater inflater, ViewGroup container,
  //                           Bundle savedInstanceState) {
  //      TextView textView = new TextView(getActivity());
   //     textView.setText(R.string.hello_blank_fragment);
  //      return textView;
 //   }

//}
