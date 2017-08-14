package viktorkhon.com.udacity_project_5_newyorkguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters.RecAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Recommendation> recs = new ArrayList<>();
        recs.add(new Recommendation(R.string.hotel_penn, R.string.penn_address, R.string.penn_desc));
        recs.add(new Recommendation(R.string.wyndham, R.string.wyndham_address, R.string.wyndham_desc));
        recs.add(new Recommendation(R.string.stewart_hotel, R.string.stewart_address, R.string.stewart_desc));
        recs.add(new Recommendation(R.string.tryp, R.string.tryp_address, R.string.tryp_desc));
        recs.add(new Recommendation(R.string.renaissance, R.string.renaissance_address, R.string.renaissance_desc));
        recs.add(new Recommendation(R.string.Fairfield, R.string.Fairfield_address, R.string.Fairfield_desc));

        RecAdapter adapter = new RecAdapter(getActivity(), recs);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}