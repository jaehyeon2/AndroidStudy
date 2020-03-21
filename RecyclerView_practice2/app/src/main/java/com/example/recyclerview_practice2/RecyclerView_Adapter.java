package com.example.recyclerview_practice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder> {

private ArrayList<String> mData = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textview1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textview1 = itemView.findViewById(R.id.text1);
        }
    }

    RecyclerView_Adapter(ArrayList<String> list) { mData = list; };

    @NonNull
    @Override
    public RecyclerView_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerView_Adapter.ViewHolder VH = new RecyclerView_Adapter.ViewHolder(view);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adapter.ViewHolder holder, int position) {
        String text = mData.get(position);
        holder.textview1.setText(text);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
