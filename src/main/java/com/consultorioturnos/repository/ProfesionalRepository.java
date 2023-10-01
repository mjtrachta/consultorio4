package com.consultorioturnos.repository;

import com.consultorioturnos.entity.Profesional;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesionalRepository extends ListCrudRepository<Profesional, Integer> {
    //List<Profesional> getAll();
    //Optional<List<Profesional>> getByRol(int rol);
    //Optional<List<Profesional>> getMenorQue(int especialidad);
    //void delete(int idProfesional);

}
