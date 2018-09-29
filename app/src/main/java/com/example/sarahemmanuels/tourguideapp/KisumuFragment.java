package com.example.sarahemmanuels.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KisumuFragment extends android.support.v4.app.Fragment {


    public KisumuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(getString(R.string.lake), getString(R.string.lakeinfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.takawira), getString(R.string.takawirainfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.kiti_mikayi), getString(R.string.mikayiinfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.dunga), getString(R.string.dungainfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.lake), getString(R.string.lakeinfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.takawira), getString(R.string.takawirainfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.kiti_mikayi), getString(R.string.mikayiinfo), R.drawable.img));
        sites.add(new Sites(getString(R.string.dunga), getString(R.string.dungainfo), R.drawable.img));

        SitesAdapter adapter = new SitesAdapter(getActivity(), sites);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent = new Intent(listView.getContext(), Details.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(listView.getContext(), SafariWalk.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(listView.getContext(), UhuruGardens.class);
                    listView.getContext().startActivity(intent);
                }
                if(position==3) {
                    Intent intent = new Intent(listView.getContext(), Bomas.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(listView.getContext(), CityOfSun.class);
                    listView.getContext().startActivity(intent);
                }
                if(position==5) {
                    Intent intent = new Intent(listView.getContext(), Details.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(listView.getContext(), SafariWalk.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(listView.getContext(), UhuruGardens.class);
                    listView.getContext().startActivity(intent);
                }
                if(position==8) {
                    Intent intent = new Intent(listView.getContext(), Bomas.class);
                    listView.getContext().startActivity(intent);
                }
                if (position==9){
                    Intent intent = new Intent(listView.getContext(), CityOfSun.class);
                    listView.getContext().startActivity(intent);
                }

            }
        });
        return rootView;
    }
}
