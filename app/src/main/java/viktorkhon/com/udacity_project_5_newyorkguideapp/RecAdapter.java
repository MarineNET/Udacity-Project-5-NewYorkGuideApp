package viktorkhon.com.udacity_project_5_newyorkguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Viktor Khon on 8/13/2017.
 */

public class RecAdapter extends ArrayAdapter<Recommendations> {
    public RecAdapter(Activity context, ArrayList<Recommendations> recs) {
        super(context, 0, recs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hotels,
                    parent, false);
        }

        final Recommendations recs = getItem(position);

        TextView title = (TextView) convertView.findViewById(R.id.title);
        title.setText(recs.getTitle());

        TextView address = (TextView) convertView.findViewById(R.id.address);
        address.setText(recs.getAddress());

        TextView description = (TextView) convertView.findViewById(R.id.description);
        description.setText(recs.getDescription());

        return convertView;
    }
}