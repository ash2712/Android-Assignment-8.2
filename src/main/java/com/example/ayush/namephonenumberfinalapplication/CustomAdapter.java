package com.example.ayush.namephonenumberfinalapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 6/24/2017.
 */

public class CustomAdapter extends BaseAdapter{
    private Context mContext;
    private ArrayList<Data> mData;
    LayoutInflater mInflator;

    public CustomAdapter(Context context, ArrayList<Data> list){
        mContext = context;
        mData = list;
        mInflator = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {

        return mData.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mInflator.inflate(R.layout.activity_main, parent, false);
        TextView tv1 = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tv2 = (TextView) convertView.findViewById(R.id.tv_phoneNumber);
        tv1.setText(mData.get(position).getName());
        tv2.setText(mData.get(position).getPhoneNumber());
        return convertView;
    }
}
