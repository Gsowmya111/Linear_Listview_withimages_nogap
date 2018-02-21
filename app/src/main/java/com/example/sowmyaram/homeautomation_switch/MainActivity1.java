package com.example.sowmyaram.homeautomation_switch;

/**
 * Created by sowmyaram on 5/26/2017.
 */

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity1 extends Activity
       {

           int pos=0;


           public static final Integer[] images = { R.drawable.backyard,R.drawable.cafeteria,R.drawable.entrance,R.drawable.balcony,
           R.drawable.bed_room,R.drawable.dressing_room,R.drawable.dining_room};


           /*public static final Integer[] images1 = { R.drawable.backyard01,R.drawable.cafeteria01,R.drawable.entrance01,R.drawable.balcony01,
                   R.drawable.bed_room01,R.drawable.dressing_room01,R.drawable.dining_room01};

*/


           public AdapterView mCatchList;
    ListView listView;
    List<Rowitem> rowItems;
           List<Rowitem> rowItems1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_fragment);

        rowItems = new ArrayList<Rowitem>();
        for (int i = 0; i < images.length; i++) {
            Rowitem item = new Rowitem(images[i]);
            rowItems.add(item);
        }

        /*rowItems1 = new ArrayList<Rowitem>();
        for (int i = 0; i < images1.length; i++) {
            Rowitem item1 = new Rowitem(images1[i]);
            rowItems.add(item1);
        }*/


        ListView listView = (ListView) findViewById(R.id.list);
       // listView = (ListView) findViewById(R.id.list);
        final Custom_listAdapter adapter = new Custom_listAdapter(this,
                R.layout.my_list, rowItems);
        listView.setAdapter(adapter);
        listView.setSelection(pos);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

    //    listView.setOnItemClickListener(new OnItemClickListener() {


        /*    @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ImageView imageView = (ImageView) view.findViewById(R.id.icon);
              //   pos = listView.getFirstVisiblePosition();
                pos=images[position];

          imageView.setImageResource(images[position]);
                if(position==0) {

                    imageView.setImageResource(R.drawable.backyard01);
                   // Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }
               // adapter.notifyDataSetChanged();
                if(position==1){
                    imageView.setImageResource(R.drawable.cafeteria01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();


                }
                if(position==2){
                    imageView.setImageResource(R.drawable.entrance01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }
                if(position==3){
                    imageView.setImageResource(R.drawable.balcony01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }
                if(position==4){
                    imageView.setImageResource(R.drawable.bed_room01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }
                if(position==5){
                    imageView.setImageResource(R.drawable.dressing_room01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }
                if(position==6){
                    imageView.setImageResource(R.drawable.dining_room01);
                    Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_LONG).show();

                }

            }



        });
*/

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}

