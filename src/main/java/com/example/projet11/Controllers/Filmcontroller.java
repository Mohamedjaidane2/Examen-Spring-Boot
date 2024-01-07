package com.example.projet11.Controllers;


import com.example.projet11.entities.Film;
import com.example.projet11.sevices.IServiceCategory;
import com.example.projet11.sevices.IServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/film/")
public class Filmcontroller {

    @Autowired
    IServiceFilm iServiceFilm;
    @Autowired
    IServiceCategory iServiceCategory;

    @GetMapping("all")
    public String all(Model model){
        model.addAttribute("films",iServiceFilm.findAllFilms());
        return "affiche";
    }



    @GetMapping("new")
    public String afficheNewForm(Model model){
        model.addAttribute("categories", iServiceCategory.findAllCategorys());
        return  "ajout";
    }

    @PostMapping("add")
    public String add(Film f){
        iServiceFilm.createFilm(f);
        return "redirect:/film/all";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
        iServiceFilm.deleteFilm(iServiceFilm.findFilmById(id));
        return "redirect:/film/all";
    }

    @GetMapping("/edit/{id}")
    public String editFilm(@PathVariable int id, Model model) {
        // Recherche du film par son ID
        Film film = iServiceFilm.findFilmById(id);

        model.addAttribute("film", film);
        model.addAttribute("categories", iServiceCategory.findAllCategorys());

        return "edit";
    }




    @PostMapping("/update")
    public String update(@ModelAttribute Film film){
        iServiceFilm.updateFilm(film);
        return "redirect:/film/all";
    }
}
