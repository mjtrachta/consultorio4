package com.consultorioturnos.persistence;

import com.consultorioturnos.persistence.crud.ProfesionalCrudRepository;
import com.consultorioturnos.persistence.entity.Profesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProfesionalRepository {

    @Autowired
    private ProfesionalCrudRepository profesionalCrudRepository;


    public List<Profesional> getAll(){
        return (List<Profesional>) profesionalCrudRepository.findAll();
    }


    public List<Profesional> getByRol(int rol){
        return profesionalCrudRepository.findByRol(rol);
    }

    //2- retorna profesionales con especialidad menor a x numero

    public Optional<List<Profesional>> getMenorQue(int especialidad){
        return  profesionalCrudRepository.findByEspecialidadLessThan(especialidad);
    }


    public Optional<Profesional> getProfesional(int idProfesional){
        return profesionalCrudRepository.findById(idProfesional);
    }


    public Profesional save(Profesional profesional){
        return  profesionalCrudRepository.save(profesional);
    }


    public void delete(int idProfesional){
        profesionalCrudRepository.deleteById(idProfesional);
    }

}
