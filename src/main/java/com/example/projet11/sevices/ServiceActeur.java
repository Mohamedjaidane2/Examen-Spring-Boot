package com.example.projet11.sevices;

import com.example.projet11.entities.Acteur;
import com.example.projet11.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceActeur implements IServiceActeur {

    @Autowired
    ActeurRepository ActeurRepository;

    @Override
    public Acteur createActeur(Acteur f) {
        return ActeurRepository.save(f);


    }

    @Override
    public Acteur findActeurById(int id) {
        return ActeurRepository.findById(id).get();
    }


    @Override
    public Acteur updateActeur(Acteur f) {
        return ActeurRepository.save(f);
    }

    @Override
    public List<Acteur> findAllActeurs() {
        return ActeurRepository.findAll();
    }

    @Override
    public void deleteActeur(Acteur f) {
        ActeurRepository.delete(f);
    }

    @Override
    public Boolean acteurExist(int id){
        return  ActeurRepository.existsById(id);
    }

}
