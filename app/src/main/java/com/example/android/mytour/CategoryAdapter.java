package com.example.android.mytour;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DisneylandFragment();
        } else if (position == 1) {
            return new KnottsBerryFarmFragment();
        } else if (position == 2) {
            return new MagicMountainFragment();
        } else {
            return new UniversalStudioFragment();
        }
    }
    /**
     * Return the total number of pages.
     */

    @Override
    public int getCount() {
        return 4;
    }


    @Override

    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.category_disneyland);
        } else if (position == 1) {
            return mContext.getString(R.string.category_knotts_berry_farm);
        } else if (position == 2) {
            return mContext.getString(R.string.category_magic_mountain);
        } else {
            return mContext.getString(R.string.category_universal_studio);

        }

    }

}