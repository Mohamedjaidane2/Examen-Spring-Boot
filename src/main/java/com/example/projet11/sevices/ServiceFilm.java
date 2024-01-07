package com.example.projet11.sevices;

import com.example.projet11.entities.Film;
import com.example.projet11.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceFilm implements IServiceFilm{

    @Autowired
    FilmRepository filmRepository;

    @Override
    public Film createFilm(Film f) {
        return filmRepository.save(f);


    }

    @Override
    public Film findFilmById(int id) {
        return filmRepository.findById(id).get();
    }



    @Override
    public Film updateFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    //@Override
    //public List<Film> findByAnneeparution(int year) {
      //  return filmRepository.findBy(year);
   // }

    @Override
    public void deleteFilm(Film f){
        filmRepository.delete(f);
    }

    @Override
    public Boolean filmExist(int id){
        return  filmRepository.existsById(id);
    }

}
