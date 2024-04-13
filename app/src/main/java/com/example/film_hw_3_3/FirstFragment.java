package com.example.film_hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView rvFilm;

    private ArrayList<String> filmList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFilm = requireActivity().findViewById(R.id.rv_film);
        loadData();
        FilmAdapter filmAdapter = new FilmAdapter(filmList);
        rvFilm.setAdapter(filmAdapter);

    }

    public void loadData() {
        filmList.add("Побег из Шоушенка");
        filmList.add("Крёстный отец");
        filmList.add("Звёздные войны: Эпизод V – Империя наносит ответный удар");
        filmList.add("Властелин колец: Братство кольца");
        filmList.add("Криминальное чтиво");
        filmList.add("Зелёная миля");
        filmList.add("Форрест Гамп");
        filmList.add("Тёмный рыцарь");
        filmList.add("Бойцовский клуб");
        filmList.add("Матрица");
        filmList.add("Хороший, плохой, злой");
        filmList.add("Пираты Карибского моря");
        filmList.add("Звёздные войны: Эпизод IV – Новая надежда");
        filmList.add("Пролетая над гнездом кукушки");
        filmList.add("Гладиатор");
        filmList.add("Интерстеллар");
        filmList.add("Леон");
        filmList.add("Назад в будущее");
        filmList.add("Список Шиндлера");
        filmList.add("История игрушек");
        filmList.add("Титаник");
    }
}