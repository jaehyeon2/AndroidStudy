package com.example.recyclerciew_practice4;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {
    private ArrayList<item> mList;

    public class CustomHolder extends RecyclerView.ViewHolder {
        protected TextView id;
        protected TextView name;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            this.id = (TextView) itemView.findViewById(R.id.id_item);
            this.name = (TextView) itemView.findViewById(R.id.name_item);
        }
    }

    CustomAdapter(ArrayList<item> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view =inflater.inflate(R.layout.item_list, parent, false);
        CustomAdapter.CustomHolder customHolder =new CustomAdapter.CustomHolder(view);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        holder.id.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        holder.name.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        holder.id.setGravity(Gravity.CENTER);
        holder.name.setGravity(Gravity.CENTER);

        holder.id.setText(mList.get(position).getId());
        holder.id.setText(mList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}
