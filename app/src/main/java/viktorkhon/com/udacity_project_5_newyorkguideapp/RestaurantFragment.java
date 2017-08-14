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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Recommendations> recs = new ArrayList<>();
        recs.add(new Recommendations(R.string.barbetta, R.string.barbetta_address, R.string.barbetta_descr,
                R.drawable._barbetta_wallace_jordan_01__card));
        recs.add(new Recommendations(R.string.brasserie, R.string.brasserie_address, R.string.brasserie_descr,
                R.drawable.brasserie));
        recs.add(new Recommendations(R.string.cipriani, R.string.cipriani_address, R.string.cipriani_descr,
                R.drawable.cipriani_wall_street));
        recs.add(new Recommendations(R.string.delmonico, R.string.delmonico_address, R.string.delmonico_desc,
                R.drawable.delmonico));
        recs.add(new Recommendations(R.string.felidia, R.string.felidia_address, R.string.felidia_desc,
                R.drawable.felidia));

        final RecAdapter adapter = new RecAdapter(getActivity(), recs);
        final ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}