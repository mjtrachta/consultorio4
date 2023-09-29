package com.consultorioturnos.domain.service;

import com.consultorioturnos.domain.repository.ProfesionalRepository;
import com.consultorioturnos.persistence.crud.ProfesionalCrudRepository;
import com.consultorioturnos.persistence.entity.Profesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesionalService {

    @Autowired
    private ProfesionalCrudRepository profesionalRepository;

    public List<Profesional> getAll(){
        return profesionalRepository.findAll();
    }
}
