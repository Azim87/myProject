package com.kubatov.testwork.ActivitiesFolder.tripAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubatov.testwork.ActivitiesFolder.ViewHolders.TripViewHolder;
import com.kubatov.testwork.R;


public class TripTypeAdapter extends RecyclerView.Adapter<TripViewHolder> {


    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_holder_trip, viewGroup, false);
        TripViewHolder tripViewHolder = new TripViewHolder(view);
        return tripViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TripViewHolder tripViewHolder, int i) {
        tripViewHolder.onBind("dfadfdf d");

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
