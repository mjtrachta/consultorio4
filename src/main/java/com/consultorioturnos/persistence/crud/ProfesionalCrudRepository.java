package com.consultorioturnos.persistence.crud;

import com.consultorioturnos.persistence.entity.Profesional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProfesionalCrudRepository extends CrudRepository<Profesional, Integer> {

    List<Profesional> findAll();
    List<Profesional> findByRol(int rol);

    //2- retorna profesionales con especialidad menor a x numero
    Optional<List<Profesional>> findByEspecialidadLessThan(int especialidad );


}
