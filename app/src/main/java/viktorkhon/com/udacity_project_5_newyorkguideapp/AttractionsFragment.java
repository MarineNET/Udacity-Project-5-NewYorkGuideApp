package viktorkhon.com.udacity_project_5_newyorkguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters.AttractionAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Recommendations> recs = new ArrayList<>();
        recs.add(new Recommendations(R.string.big_apple_greeter, R.string.big_apple_greeter_desc));
        recs.add(new Recommendations(R.string.central_park, R.string.central_park_desc));
        recs.add(new Recommendations(R.string.tours_by_foot, R.string.tours_by_foot_desc));
        recs.add(new Recommendations(R.string.grand_central_partnership, R.string.grand_central_partnership_desc));
        recs.add(new Recommendations(R.string.brooklyn_brewery, R.string.brooklyn_brewery_desc));
        recs.add(new Recommendations(R.string.village_alliance, R.string.village_alliance_desc));

        final AttractionAdapter adapter = new AttractionAdapter(getActivity(), recs);
        final ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }

}
