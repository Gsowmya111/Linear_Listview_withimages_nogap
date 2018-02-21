package com.example.sowmyaram.homeautomation_switch;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] images={R.drawable.ac,R.drawable.aquarium,R.drawable.bell,R.drawable.curtain,R.drawable.dimmer,R.drawable.dog,R.drawable.door_lock,
            R.drawable.fm,R.drawable.geyser, R.drawable.pir,R.drawable.rgb, R.drawable.sprinkler,R.drawable.switch_board,

    };

    public ImageAdapter(Context c)
    {
        context=c;
    }

    @Override
    public int getCount() {

        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
       /* imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));*/
        return imageView;
    }
}
