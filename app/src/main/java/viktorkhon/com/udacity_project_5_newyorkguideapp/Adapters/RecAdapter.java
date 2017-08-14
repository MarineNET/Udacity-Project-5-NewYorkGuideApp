package viktorkhon.com.udacity_project_5_newyorkguideapp.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import viktorkhon.com.udacity_project_5_newyorkguideapp.R;
import viktorkhon.com.udacity_project_5_newyorkguideapp.Recommendation;

/**
 * Created by Viktor Khon on 8/13/2017.
 */

public class RecAdapter extends ArrayAdapter<Recommendation> {

    private static class ViewHolder {
        private TextView title;
        private TextView address;
        private TextView description;
        private ImageView image;
    }

    public RecAdapter(Activity context, ArrayList<Recommendation> recs) {
        super(context, 0, recs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.restaurants_and_hotels,
                    parent, false);
        }

        final Recommendation recs = getItem(position);

        ViewHolder holder = new ViewHolder();

        holder.title = (TextView) convertView.findViewById(R.id.title);
        holder.title.setText(recs.getTitle());

        holder.address = (TextView) convertView.findViewById(R.id.address);
        holder.address.setText(recs.getAddress());

        holder.description = (TextView) convertView.findViewById(R.id.description);
        holder.description.setText(recs.getDescription());

        holder.image = (ImageView) convertView.findViewById(R.id.iv_image);
        if (recs.hasImage()) {
            holder.image.setImageResource(recs.getImage());

        } else {
            holder.image.setVisibility(View.GONE);
        }

        return convertView;
    }
}