package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class GridViewAdapter extends ArrayAdapter<Model> {

    public GridViewAdapter(Context context, ArrayList<Model> list){
        super(context,0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View itemView = convertView;
        if (itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item,parent,false);
        }
        Model model = getItem(position);
        TextView textView = itemView.findViewById(R.id.texyView);
        ImageView imageView = itemView.findViewById(R.id.imageview);
        if (model != null){
            textView.setText(model.getName());
            imageView.setImageResource(model.getImage());
        }
        return itemView;
    }
}
