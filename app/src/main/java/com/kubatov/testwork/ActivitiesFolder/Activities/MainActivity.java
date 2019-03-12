package com.kubatov.testwork.ActivitiesFolder.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.kubatov.testwork.ActivitiesFolder.tripAdapter.TripTypeAdapter;
import com.kubatov.testwork.R;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    TripTypeAdapter tripAdapter;
    RecyclerView.LayoutManager layoutManager;
   // Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutManager = new LinearLayoutManager(this);
        tripAdapter = new TripTypeAdapter();
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(tripAdapter);
        recyclerView.setLayoutManager(layoutManager);

//        button = findViewById(R.id.start_1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(intent);
//            }
//        });
    }

}
