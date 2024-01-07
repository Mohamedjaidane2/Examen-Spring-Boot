package com.example.projet11.sevices;

import com.example.projet11.entities.Film;

import java.util.List;

public interface IServiceFilm {

    public Film createFilm(Film f);

    public  Film findFilmById(int id);

    public Film updateFilm (Film f);

    public List<Film> findAllFilms();

    ///public List<Film> findByAnneeparution(int year);

    public void deleteFilm(Film f);


    Boolean filmExist(int id);
}
