package com.example.carito.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/*
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Location} objects.
 * */
public class LocationAdapter extends ArrayAdapter<Location>{

    /** CONSTRUCTOR
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * Create a new {@Link WordAdapter} object.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param locations      A list of place to visit in Santiago, Chile.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, locations);
    }

    /**
     * * METHOD
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Location} object located at this position in the list
        Location currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_text_view
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the location name from the current Location object and
        // set this text on the Location Name TextView
        locationTextView.setText(currentWord.getLocationName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Location

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        return listItemView;
    }

}