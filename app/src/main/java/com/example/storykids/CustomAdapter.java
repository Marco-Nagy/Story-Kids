package com.example.storykids;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.KeyRep;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Story> stories;
    private Activity activity;
    public CustomAdapter(ArrayList<Story> stories, Activity activity) {
        this.stories = stories;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return stories.size();
    }

    @Override
    public Object getItem(int position) {
        return (position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= activity.getLayoutInflater();
        view= inflater.inflate(R.layout.list_view,parent,false);
        TextView textView =view.findViewById(R.id.text_list);
        ImageView imageView =view.findViewById(R.id.image_list);
        textView.setText(stories.get(position).getName());
        imageView.setImageResource(stories.get(position).getPic());

        return view;
    }

}

