package com.example.recyclerview_practice3;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder> {

    private ArrayList<Dictionary> mList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView id;
        protected TextView english;
        protected TextView korean;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.id = itemView.findViewById(R.id.item_id);
            this.english = itemView.findViewById(R.id.item_english);
            this.korean = itemView.findViewById(R.id.item_korean);
        }
    }

    public RecyclerView_Adapter(ArrayList<Dictionary> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.id.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        holder.english.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        holder.korean.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        holder.id.setGravity(Gravity.CENTER);
        holder.english.setGravity(Gravity.CENTER);
        holder.korean.setGravity(Gravity.CENTER);

        holder.id.setText(mList.get(position).getId());
        holder.english.setText(mList.get(position).getEnglish());
        holder.korean.setText(mList.get(position).getKorean());

    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }

}
