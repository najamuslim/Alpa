package com.mis.alpa.alpa;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AddTask extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton addtask;
    private ArrayList<String> nametask = new ArrayList<>();
    private ArrayList<String> taskdate = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(this, nametask, taskdate));
        addtask=(FloatingActionButton)findViewById(R.id.floatingActionButton);
        addtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(),NewTask.class);
                startActivity(i1);
            }
        });
    }
}
