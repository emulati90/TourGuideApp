package com.example.sarahemmanuels.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NairobiFragment();
        } else if (position == 1) {
            return new BungomaFragment();
        } else if (position == 2) {
            return new KisumuFragment();
        } else if (position == 3){
            return new MombasaFragment();
        } else {
            return new NakuruFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.nai);
        } else if (position == 1) {
            return mContext.getString(R.string.bgm);
        } else if (position == 2) {
            return mContext.getString(R.string.ksm);
        }  else if (position == 3) {
            return mContext.getString(R.string.mbs);
        }else {
            return mContext.getString(R.string.nkr);
        }
    }
}
