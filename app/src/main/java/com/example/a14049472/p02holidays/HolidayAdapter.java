package com.example.a14049472.p02holidays;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday>{

    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvsecular;
    private ImageView imgView;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvsecular = (TextView) rowView.findViewById(R.id.tvsecular);
        // Get the ImageView object
        imgView = (ImageView) rowView.findViewById(R.id.imgView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        tvsecular.setText(currentHoliday.getName());
        // Set the image to star or nostar accordingly
        if(currentHoliday.isPic()) {
            imgView.setImageResource(R.drawable.newyear);
        }
        else {
            imgView.setImageResource(R.drawable.labourday);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
