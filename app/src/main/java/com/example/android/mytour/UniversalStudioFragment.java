package com.example.android.mytour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class UniversalStudioFragment extends Fragment {


    public UniversalStudioFragment() {
        // Required empty public constructor
    }
  //  @Override
  //  public void onCreate(Bundle savedInstanceState) {
  //      super.onCreate(savedInstanceState);
  //  }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        // return inflater.inflate(R.layout.activity_disneyland, container, false);

        View rootView = inflater.inflate(R.layout.activity_universal_studio, container, false);

        final ArrayList<Ride> rides = new ArrayList<Ride>();
        //words.add("one");

        rides.add(new Ride("Harry Potter", "Get ready to soar above the castle grounds.",
                R.drawable.universal__harry__potter));
        rides.add(new Ride("Jurassic Park", "Meet Blue the Velociraptor and the friendly new Triceratops.",
                R.drawable.universal_jurassic_park));
        rides.add(new Ride("King Kong", "Your survival instincts will be on overload..",
                R.drawable.universal_king_kong));
        rides.add(new Ride("The Mummy", "The ride catapults guests at speeds up to 45 mph.",
                R.drawable.universal__the__mummy));

        RideAdapter adapter = new RideAdapter(getActivity(), rides, R.color.category_universal_studio);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            //   public void onItemClick(AdapterView<?> adapterView, View view, int position long l) {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Ride ride = rides.get(position);


                // Inflate the layout for this fragment
                //return inflater.inflate(R.layout.fragment_disneyland, container, false);
            }
        });

        return rootView;
    }
  //  @Override

 //   public void onStop() {
 //       super.onStop();

        // When the activity is stopped, release the media player resources because we won't

        // be playing any more sounds.

  //  }
}