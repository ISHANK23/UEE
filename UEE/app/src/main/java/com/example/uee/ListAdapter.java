package com.example.uee;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter {

    private final Activity mContext;
    List<Category> categoryList;
@SuppressWarnings("unchecked")
    public ListAdapter(Activity mContext, List<Category> categoryList){
        super(mContext,R.layout.list_item,categoryList);
        this.mContext = mContext;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = mContext.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.list_item,null,true);

        TextView tvName = listItemView.findViewById(R.id.tvName);
        TextView tvType = listItemView.findViewById(R.id.tvType);
        TextView tvIName = listItemView.findViewById(R.id.tvIName);

        Category category = categoryList.get(position);

        tvName.setText(category.getName());
        tvType.setText(category.getItem_type());
        tvIName.setText(category.getItem_name());


        return listItemView;
    }
}
