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

public class SiteInfoAdapter extends ArrayAdapter<SiteInfo> {

    public SiteInfoAdapter(Activity context, ArrayList<SiteInfo> siteinfo) {
        super(context, 0, siteinfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.detail_items, parent, false);
        }

        SiteInfo currentSiteInfo = getItem(position);

        TextView descriptionTv = (TextView) listItemView.findViewById(R.id.detail_one);
        descriptionTv.setText(currentSiteInfo.getDescription());

        TextView feesTv = (TextView) listItemView.findViewById(R.id.fees);
        feesTv.setText(currentSiteInfo.getEntryFees());

        TextView timeTv = (TextView) listItemView.findViewById(R.id.time);
        timeTv.setText(currentSiteInfo.getTime());

        return listItemView;
    }
}
