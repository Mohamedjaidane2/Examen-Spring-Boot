package com.example.projet11.repository;

import com.example.projet11.entities.Acteur;
import com.example.projet11.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur,Integer> {
}
