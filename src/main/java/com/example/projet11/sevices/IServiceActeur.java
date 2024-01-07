package com.example.projet11.sevices;

import com.example.projet11.entities.Acteur;

import java.util.List;

public interface IServiceActeur {
    public Acteur createActeur(Acteur a) ;

    public  Acteur findActeurById(int id);

    public Acteur updateActeur (Acteur a);

    public List<Acteur> findAllActeurs();

    public void deleteActeur(Acteur a);

    Boolean acteurExist(int id);
}
