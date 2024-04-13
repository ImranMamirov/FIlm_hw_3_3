package com.example.film_hw_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFilmName;

    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFilmName = itemView.findViewById(R.id.tv_film_name);
    }

    public void onBind(String film) {
        tvFilmName.setText(film);
    }
}
