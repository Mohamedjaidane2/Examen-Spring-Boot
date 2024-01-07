package com.example.projet11.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String Name;
    private String LastName;
    @ManyToMany(mappedBy = "acteurs",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Film> films;

}