package com.example.wlw.fruet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wlw on 2016/12/8.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    public FruitAdapter(Context context, int resource, List<Fruit> object) {
        super(context, resource,object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view;
        if (convertView==null)
        {

            view= LayoutInflater.from(getContext()).inflate(R.layout.activity_fruit,null);
        }else {

            view=convertView;

        }
        ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView fruitTitle=(TextView)view.findViewById(R.id.fruit_title);
        TextView fruitDesc=(TextView)view.findViewById(R.id.fruit_desc);
        fruitTitle.setText(fruit.getTitle());
        fruitImage.setImageResource(fruit.getImageID());
        fruitDesc.setText(fruit.getDesc());

        return view;
    }
}
