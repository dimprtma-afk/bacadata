package com.example.bacadata;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class mainactivity2 extends AppCompatActivity {

    RecyclerView rcview2;
    myadapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rcview2=(RecyclerView)findViewById(R.id.rcview2);
        rcview2.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model2> options =
                new FirebaseRecyclerOptions.Builder<model2>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Data Keluhan"), model2.class)
                        .build();

        adapter2=new myadapter2(options);
        rcview2.setAdapter(adapter2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter2.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adapter2.stopListening();
    }
}
