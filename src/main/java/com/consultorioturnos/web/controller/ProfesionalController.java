package com.consultorioturnos.web.controller;

import com.consultorioturnos.domain.service.ProfesionalService;
import com.consultorioturnos.persistence.entity.Profesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profesionales")
public class ProfesionalController {

    @Autowired
    private ProfesionalService profesionalService;

    @GetMapping("/all")
    public List<Profesional> getAll(){
        return profesionalService.getAll();
    }
}
