package com.example.rey.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rey.R;
import com.example.rey.modelos.productos;

import java.util.List;

public class ProducAdapter extends ArrayAdapter<productos> {

    Context context;

    private class ViewHolder {
        //NetworkImageView image;
        TextView Name;
        TextView Quantity;
        TextView Price;
        TextView Image;
        ImageButton btnAddToBag;

        private ViewHolder() {
        }
    }
    public ProducAdapter(Context context, List<productos> items) {
        super(context, 0, items);
        this.context = context;
        //this.queue = _queue;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final productos rowItem = (productos) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_product_items, null);
            holder = new ViewHolder();
           holder.Image = (TextView) convertView.findViewById(R.id.Image);
           holder.Quantity = (TextView) convertView.findViewById(R.id.Quantity);
            holder.Name = (TextView) convertView.findViewById(R.id.Name);
            holder.Price = (TextView) convertView.findViewById(R.id.Price);
            holder.Quantity = (TextView) convertView.findViewById(R.id.Image);
            // holder.category = (TextView) convertView.findViewById(R.id.category);
           // holder.btnAddToBag = (ImageButton) convertView.findViewById(R.id.btnAddToBag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.Name.setText(rowItem.Name);
        holder.Price.setText(rowItem.Price);
        holder.Quantity.setText(rowItem.Quantity);
        holder.Image.setText(rowItem.Image);
        //holder.category.setText(rowItem.getCategory());

        //if ( rowItem.getSmallImage() != null ) {
        //   holder.image.setImageUrl(
        //            rowItem.getSmallImage(), queue);
        //  }

        //  holder.btnAddToBag.setOnClickListener(new View.OnClickListener() {

        //@Override
        //public void onClick(View v) {
        //      ProductListActivity activity = (ProductListActivity) context;
        //        activity.selectProduct(position);

        //   }
        // });


//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }
}
