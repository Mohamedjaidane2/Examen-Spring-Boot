package com.example.projet11.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id  @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int id;
    private  String nom;
    @OneToMany(mappedBy = "categorie",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Film> films;

}
