package com.example.bkt2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class List extends AppCompatActivity {

    RecyclerView recyclerView;
    Mainadapter mainadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView= findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModel> options =
                new FirebaseRecyclerOptions.Builder<MainModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("medicinal_plants"),MainModel.class)
                        .build();

        mainadapter =new Mainadapter(options);
        recyclerView.setAdapter(mainadapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainadapter.stopListening();
    }
}