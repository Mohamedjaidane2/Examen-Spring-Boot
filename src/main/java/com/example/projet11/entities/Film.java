package com.example.projet11.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String titre;
    private String description;
    private int anneeparution;
    @ManyToOne
    Category categorie;
    @ManyToMany
    List<Acteur> acteurs;
}
