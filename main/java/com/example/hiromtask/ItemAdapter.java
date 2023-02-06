package com.example.hiromtask;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items){
        this.context = context;
        this.items = items;

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }




  /*  public ItemAdapter(Context context, List<Item> items) {
        super(context, resource, items);
        this.context = context;
        this.items = items;
    }*/


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        Item item = items.get(position);

       // ImageView url = convertView.findViewById(R.id.thumbnailImg);
        //Picasso.get().load(item.getUrl()).into(url);

        ImageView thumbnailUrl = convertView.findViewById(R.id.thumbnailImg);
        Picasso.get().load(item.getThumbnailUrl()).into(thumbnailUrl);

        TextView albumId = convertView.findViewById(R.id.albumId);
        albumId.setText(item.getAlbumId());

        TextView id = convertView.findViewById(R.id.textId);
        id.setText(item.getId());

        TextView title = convertView.findViewById(R.id.textTitle);
        title.setText(item.getTitle());

        return convertView;
    }
   /* public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, parent, false);
        }

        Item item = items.get(position);

        ImageView url = view.findViewById(R.id.thumbnailImg);
        ImageView thumbnailUrl = view.findViewById(R.id.thumbnailImg);
        TextView albumId = view.findViewById(R.id.albumId);
        TextView id = view.findViewById(R.id.textId);
        TextView title = view.findViewById(R.id.textTitle);

        Picasso.get().load(item.getUrl()).into(url);
        Picasso.get().load(item.getThumbnailUrl()).into(thumbnailUrl);
        albumId.setText(item.getAlbumId());
        id.setText(item.getId());
        title.setText(item.getTitle());

        return view;
    }*/
}