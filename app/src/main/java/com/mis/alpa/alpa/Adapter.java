package com.mis.alpa.alpa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> taskname = new ArrayList<>();
    private ArrayList<String> datetask = new ArrayList<>();
    Context context;
    public Adapter(Context context, ArrayList<String> taskname, ArrayList<String> datetask){
        this.context=context;
        this.taskname=taskname;
        this.datetask=datetask;
    }
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View row=inflater.inflate(R.layout.item_todo, parent, false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class Item extends RecyclerView.ViewHolder{
        CheckBox textView;
        TextView datetime;
        LinearLayout parentLayout;
        public Item(View itemView){
            super(itemView);
            textView=itemView.findViewById(R.id.TitleTask);
            datetime=itemView.findViewById(R.id.dateTime);
            parentLayout=itemView.findViewById(R.id.parent_layout);
        }
    }
}
