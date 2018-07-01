package com.example.android.charlestontourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * @param position of fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StayFragment();
        } else if (position == 1) {
            return new EatFragment();
        } else if (position == 2) {
            return new PlayFragment();
        } else if (position == 3) {
            return new ShopFragment();
        } else {
            return new TourFragment();
        }
    }

    /**
     * @param position of fragment
     * @return page title
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_stay);
        } else if (position == 1) {
            return mContext.getString(R.string.category_eat);
        } else if (position == 2) {
            return mContext.getString(R.string.category_play);
        } else if (position == 3) {
            return mContext.getString(R.string.category_shop);
        } else {
            return mContext.getString(R.string.category_tour);
        }
    }

    /**
     * @return number of fragments
     */
    @Override
    public int getCount() {
        return 5;
    }
}
