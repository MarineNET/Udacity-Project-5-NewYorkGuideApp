package viktorkhon.com.udacity_project_5_newyorkguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
