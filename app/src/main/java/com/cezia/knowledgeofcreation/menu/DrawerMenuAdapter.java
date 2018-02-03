package com.cezia.knowledgeofcreation.menu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cezia.knowledgeofcreation.R;

public class DrawerMenuAdapter extends ArrayAdapter<ItemDrawerMenu> {

    Context context;
    int layoutResourceId;
    ItemDrawerMenu[] data = null;

    public DrawerMenuAdapter(Context context, int layoutResourceId, ItemDrawerMenu[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemMenuHolder holder = null;
        if (row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ItemMenuHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }else{
            holder = (ItemMenuHolder)row.getTag();
        }

        ItemDrawerMenu itemDrawerMenu = data[position];
        holder.txtTitle.setText(itemDrawerMenu.title);
        holder.imgIcon.setImageResource(itemDrawerMenu.icon);

        return row;
    }

    static class ItemMenuHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
