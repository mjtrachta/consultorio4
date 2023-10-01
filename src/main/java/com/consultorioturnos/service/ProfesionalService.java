package com.consultorioturnos.service;


import com.consultorioturnos.entity.Profesional;
import com.consultorioturnos.repository.ProfesionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesionalService {
    private final ProfesionalRepository profesionalRepository;

    @Autowired
    public ProfesionalService(ProfesionalRepository profesionalRepository){
        this.profesionalRepository =  profesionalRepository;
    }

    public List<Profesional> getAll(){

        return this.profesionalRepository.findAll();
    }

    public Profesional get(int idProfesional){
        return this.profesionalRepository.findById(idProfesional).orElse(null);
    }

    public  Profesional save(Profesional profesional){
        return  this.profesionalRepository.save(profesional);
    }
}
