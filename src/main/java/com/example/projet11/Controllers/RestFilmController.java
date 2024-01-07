package com.example.projet11.Controllers;


import com.example.projet11.Exception.FilmNotfoundException;
import com.example.projet11.entities.Film;
import com.example.projet11.sevices.IServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class RestFilmController {
    @Autowired
    IServiceFilm iServiceFilm;

    @GetMapping("")
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public List<Film> getall(){
        return iServiceFilm.findAllFilms();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public Film find(@PathVariable int id){
        if(!iServiceFilm.filmExist(id) )throw new FilmNotfoundException();
        return  iServiceFilm.findFilmById(id);
    }

   // @GetMapping("/byYear/{year}")
   // public List<Film> getFilmsByYear(@PathVariable int year) {
      //  return iServiceFilm.findByAnneeparution(year);
    //}
    @PostMapping("/add")
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public Film add(@RequestBody Film f){
        return  iServiceFilm.createFilm(f);
    }

    @DeleteMapping("/delete/{id}")

    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public  String delete (@PathVariable int  id){
        if(!iServiceFilm.filmExist(id) )throw new FilmNotfoundException();
         iServiceFilm.deleteFilm(iServiceFilm.findFilmById(id));
         return "supprimer";
    }

    @PutMapping("/update")

    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public String update(@RequestBody Film f){

         iServiceFilm.updateFilm( f);
         return "film updated";
    }


}
