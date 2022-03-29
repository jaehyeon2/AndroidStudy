package com.example.recyclerview_practice1;

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
        TextView textView1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //View 객체에 대한 참조 (hold string reference)
            textView1 = itemView.findViewById(R.id.item1);
        }
    }

    //리스트 객체 전달받음
    RecyclerView_Adapter(ArrayList<String> list){
        mData =list;
    }

    //onCreateViewHolder() -> 뷰 홀더 객체 생성하며 리턴
    @Override
    public RecyclerView_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //LayoutInflater -> xml 파일을 view 객체로 만듦

        View view = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerView_Adapter.ViewHolder VH = new RecyclerView_Adapter.ViewHolder(view);

        return VH;
    }

    //position에 해당하는 데이터를 뷰홀더에 표시
    @Override
    public void onBindViewHolder(RecyclerView_Adapter.ViewHolder holder, int position) {
        String text = mData.get(position);
        holder.textView1.setText(text);
    }

    //데이터 갯수 리턴
    @Override
    public int getItemCount(){
        return mData.size();
    }
}


//참조
// https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=ko
// https://recipes4dev.tistory.com/154