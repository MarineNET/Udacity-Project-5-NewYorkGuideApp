package viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import viktorkhon.com.udacity_project_5_newyorkguideapp.AttractionsFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.HotelsFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.R;
import viktorkhon.com.udacity_project_5_newyorkguideapp.RestaurantFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.ToursFragment;

/**
 * Created by Viktor Khon on 8/13/2017.
 */

public class RecFragmentPagerAdapter extends FragmentPagerAdapter {
    Context mContext;
    public RecFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RestaurantFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new ToursFragment();
            case 3:
                return new AttractionsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.restaurants);
            case 1:
                return mContext.getString(R.string.hotels);
            case 2:
                return mContext.getString(R.string.tours);
            case 3:
                return mContext.getString(R.string.attractions);
            default:
                return null;
        }
    }
}
