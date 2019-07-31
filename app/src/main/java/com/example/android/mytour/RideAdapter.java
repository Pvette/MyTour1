package com.example.android.mytour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class RideAdapter extends ArrayAdapter<Ride> {
    private int mColorResourceId;

    public RideAdapter(Context context, ArrayList<Ride> rides, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, rides);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Ride currentRide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView rideTextView = (TextView) listItemView.findViewById(R.id.ride_text_view);

        // set this text on the name TextView
        rideTextView.setText(currentRide.getRide());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionTextView.setText(currentRide.getDescription());

        //Find the ImageView in the list_item.xml layout with the Id list_item_icon
        //  ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //Get the Image Resource Id from the current WordAdapter object and set the image to imageviewiew
        //  imageView.setImageResource(currentWord.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID image.

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not

        if (currentRide.hasImage()) {
            // Set the ImageView to the image resource specified in the current Word

            imageView.setImageResource(currentRide.getImageResourceId());

            // Make sure the view is visible

            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Set the background color of the text container View
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //Find the color that the resource ID maps to
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
