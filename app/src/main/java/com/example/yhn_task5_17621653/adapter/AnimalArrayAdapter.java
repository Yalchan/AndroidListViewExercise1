package com.example.yhn_task5_17621653.adapter;

import com.example.yhn_task5_17621653.R;
import com.example.yhn_task5_17621653.model.Animal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.LinkedList;

public class AnimalArrayAdapter extends ArrayAdapter<Animal> {
    private LinkedList<Animal> animals;

    public AnimalArrayAdapter(Context context, LinkedList<Animal> animals) {
        super(context,R.layout.animal_row,animals);
        this.animals=animals;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
            row = inflater.inflate(R.layout.animal_row, null,true);
        TextView textView = (TextView) row.findViewById(R.id.animalName);
        ImageView imageView = (ImageView) row.findViewById(R.id.animalImage);
        textView.setText(animals.get(position).getAnimalName());
        imageView.setImageResource(animals.get(position).getPictureId());
        return row;
    }
}
