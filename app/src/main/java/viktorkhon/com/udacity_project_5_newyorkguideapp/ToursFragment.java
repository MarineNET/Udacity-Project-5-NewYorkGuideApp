package viktorkhon.com.udacity_project_5_newyorkguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters.AttractionAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToursFragment extends Fragment {


    public ToursFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Recommendations> recs = new ArrayList<>();
        recs.add(new Recommendations(R.string.top_of_the_rock, R.string.top_of_the_rock_desc));
        recs.add(new Recommendations(R.string.empire_state, R.string.empire_state_desc));
        recs.add(new Recommendations(R.string.statue_liberty, R.string.statue_liberty_desc));
        recs.add(new Recommendations(R.string.museum_natural_history, R.string.museum_natural_history_desc));
        recs.add(new Recommendations(R.string.museum_modern_arts, R.string.museum_modern_arts_desc));
        recs.add(new Recommendations(R.string.big_bus, R.string.big_bus_desc));
        recs.add(new Recommendations(R.string.tribute_9_11, R.string.tribute_9_11_desc));
        recs.add(new Recommendations(R.string.the_met, R.string.the_met_desc));

        final AttractionAdapter adapter = new AttractionAdapter(getActivity(), recs);
        final ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }

}
