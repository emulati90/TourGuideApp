package com.example.sarahemmanuels.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;

public class Details extends AppCompatActivity {
    ImageSwitcher sw;
    Button previousBtn;
    Button nextBtn;
    int imageIds[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        nextBtn = (Button) findViewById(R.id.right_button);
        previousBtn = (Button) findViewById(R.id.left_button);

        sw = (ImageSwitcher) findViewById(R.id.imgSw);
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView slideView= new ImageView(Details.this);
                slideView.setImageResource(imageIds[currentIndex]);
                return slideView;
            }
        });

        sw.setInAnimation(this, android.R.anim.slide_in_left);
        sw.setOutAnimation(this, android.R.anim.slide_out_right);

        previousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentIndex > 0)
                    currentIndex--;
                if (currentIndex < 0)
                    currentIndex = 0;
                sw.setImageResource(imageIds[currentIndex]);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex < imageIds.length)
                    currentIndex++;
                if (currentIndex >= imageIds.length)
                    currentIndex = imageIds.length - 1;
                sw.setImageResource(imageIds[currentIndex]);
            }
        });

        ArrayList<SiteInfo> siteinfo = new ArrayList<SiteInfo>();
        siteinfo.add(new SiteInfo(getString(R.string.parkinfo), getString(R.string.fees), getString(R.string.time)));

        SiteInfoAdapter adapter = new SiteInfoAdapter(this, siteinfo);
        ListView listView = (ListView) findViewById(R.id.detail_item);
        listView.setAdapter(adapter);
    }
}
