package com.example.projet11.Controllers;

import com.example.projet11.Exception.FilmNotfoundException;
import com.example.projet11.entities.Acteur;
import com.example.projet11.entities.Acteur;
import com.example.projet11.sevices.IServiceActeur;
import com.example.projet11.sevices.IServiceActeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acteurs")
public class RestActeurController {
    @Autowired
    IServiceActeur iServiceActeur;

    @GetMapping("")
    public List<Acteur> getall(){
        return iServiceActeur.findAllActeurs();
    }

    @GetMapping("/{id}")
    public Acteur find(@PathVariable int id){
        if(!iServiceActeur.acteurExist(id) )throw new FilmNotfoundException();
        return  iServiceActeur.findActeurById(id);
    }
    @PostMapping("/add")
    public Acteur add(@RequestBody Acteur f){
        return  iServiceActeur.createActeur(f);
    }

    @DeleteMapping("/delete/{id}")
    public  String delete (@PathVariable int  id){
        if(!iServiceActeur.acteurExist(id) )throw new FilmNotfoundException();
        iServiceActeur.deleteActeur(iServiceActeur.findActeurById(id));
        return "supprimer";
    }

    @PutMapping("/update")
    public String update(@RequestBody Acteur f){
        iServiceActeur.updateActeur( f);
        return "Acteur updated";
    }


}
