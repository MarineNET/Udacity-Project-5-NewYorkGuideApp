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
        recs.add(new Recommendations(R.string.barbetta, R.string.barbetta_descr));
        recs.add(new Recommendations(R.string.barbetta, R.string.barbetta_descr));

        final AttractionAdapter adapter = new AttractionAdapter(getActivity(), recs);
        final ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }

}
