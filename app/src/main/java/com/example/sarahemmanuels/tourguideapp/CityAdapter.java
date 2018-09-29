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

public class CityAdapter extends ArrayAdapter<City>{

    public CityAdapter(Activity context, ArrayList<City> cities){
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.city_item, parent, false);
        }

        City currentCity = getItem(position);

        TextView cityTv = (TextView) listItemView.findViewById(R.id.city);
        cityTv.setText(currentCity.getCity());

        TextView siteOneTv = (TextView) listItemView.findViewById(R.id.site_one);
        siteOneTv.setText(currentCity.getSiteOne());

        TextView siteTwoTv = (TextView) listItemView.findViewById(R.id.site_two);
        siteTwoTv.setText(currentCity.getSiteTwo());

        return listItemView;
    }
}
