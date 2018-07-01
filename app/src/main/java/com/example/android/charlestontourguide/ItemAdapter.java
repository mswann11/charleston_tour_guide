package com.example.android.charlestontourguide;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private boolean isVisible = false;

    public ItemAdapter(Activity context, ArrayList<Item> itemArrayList) {
        super(context, 0, itemArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        final TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentItem.getName());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentItem.getAddress());

        TextView phone = (TextView) listItemView.findViewById(R.id.phone);
        phone.setText(currentItem.getPhone());

        TextView website = (TextView) listItemView.findViewById(R.id.website);
        website.setText(currentItem.getWebsite());

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentItem.getImageResourceId());

        final RelativeLayout item = listItemView.findViewById(R.id.item);
        final LinearLayout info = listItemView.findViewById(R.id.info);
        final TextView moreInfo = listItemView.findViewById(R.id.more_info);
        moreInfo.setText(currentItem.getMoreInfo());
        final Drawable expandLess = getContext().getResources().getDrawable(R.drawable.ic_expand_less);
        final Drawable expandMore = getContext().getResources().getDrawable(R.drawable.ic_expand_more);
        item.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isVisible) {
                    name.setCompoundDrawablesWithIntrinsicBounds(null, null, expandMore, null);
                    info.animate().translationY(0);
                    info.setVisibility(View.GONE);
                    moreInfo.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    name.setCompoundDrawablesWithIntrinsicBounds(null, null, expandLess, null);
                    info.setVisibility(View.VISIBLE);
                    info.animate().translationY(100);
                    moreInfo.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        return listItemView;
    }
}
