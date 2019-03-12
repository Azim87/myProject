package com.kubatov.testwork.ActivitiesFolder.ViewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kubatov.testwork.R;

public class TripViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;

    public TripViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.vh_trip_title);
    }

    public void onBind(String title){
        tvTitle.setText(title);
    }
}
