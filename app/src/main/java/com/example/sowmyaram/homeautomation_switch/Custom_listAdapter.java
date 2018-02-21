package com.example.sowmyaram.homeautomation_switch;

/**
 * Created by sowmyaram on 6/1/2017.
 */
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class Custom_listAdapter extends ArrayAdapter<Rowitem>{

    Context context;

    public Custom_listAdapter(Context context, int resourceId,
                              List<Rowitem> items) {
        super(context, resourceId, items);
        this.context = context;

    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Rowitem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.my_list, null);
            holder = new ViewHolder();

            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            // imageView.setLayoutParams(new list.LayoutParams(240,240));

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.imageView.setImageResource(rowItem.getImageId());

        return convertView;
    }


}