package com.example.sarahemmanuels.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SitesAdapter extends ArrayAdapter<Sites> {

    public SitesAdapter(Activity context, ArrayList<Sites> sites) {
        super(context, 0, sites);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.nairobi_items, parent, false);
        }

        Sites currentSites = getItem(position);

        TextView nameTv = (TextView) listItemView.findViewById(R.id.park0);
        nameTv.setText(currentSites.getName());

        TextView detailsTv = (TextView) listItemView.findViewById(R.id.park1);
        detailsTv.setText(currentSites.getDetails());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.park_image);
        imageView.setImageResource(currentSites.getImageId());

        return listItemView;
    }
}
