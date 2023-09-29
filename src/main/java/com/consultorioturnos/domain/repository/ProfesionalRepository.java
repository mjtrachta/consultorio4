package com.consultorioturnos.domain.repository;

import com.consultorioturnos.persistence.entity.Profesional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesionalRepository {
    List<com.consultorioturnos.persistence.entity.Profesional> getAll();
    Optional<List<Profesional>> getByRol(int rol);
    Optional<List<Profesional>> getMenorQue(int especialidad);
    void delete(int idProfesional);

}
