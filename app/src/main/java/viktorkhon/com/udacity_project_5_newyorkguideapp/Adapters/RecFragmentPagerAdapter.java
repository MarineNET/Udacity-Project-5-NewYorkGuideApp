package viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import viktorkhon.com.udacity_project_5_newyorkguideapp.AttractionsFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.HotelsFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.RestaurantFragment;
import viktorkhon.com.udacity_project_5_newyorkguideapp.ToursFragment;

/**
 * Created by Viktor Khon on 8/13/2017.
 */

public class RecFragmentPagerAdapter extends FragmentPagerAdapter {
    public RecFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new ToursFragment();
        } else {
            return new AttractionsFragment();
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
                return "Restau- rants";
            case 1:
                return "Hotels";
            case 2:
                return "Tours";
            case 3:
                return "Attracti-ons";
            default:
                return null;
        }
    }
}
