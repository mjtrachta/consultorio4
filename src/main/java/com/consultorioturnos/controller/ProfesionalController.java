package com.consultorioturnos.controller;

import com.consultorioturnos.service.ProfesionalService;
import com.consultorioturnos.entity.Profesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesionales")
public class ProfesionalController {

    private final ProfesionalService profesionalService;

    @Autowired
    public ProfesionalController(ProfesionalService profesionalService){
        this.profesionalService = profesionalService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Profesional>>  getAll(){
        return ResponseEntity.ok(this.profesionalService.getAll());
    }
    @GetMapping("/{idProfesional}")
    public ResponseEntity<Profesional>  get(@PathVariable int  idProfesional){
        return ResponseEntity.ok(this.profesionalService.get(idProfesional));
    }

    public ResponseEntity<Profesional>  add(@RequestBody Profesional profesional){
        return ResponseEntity.ok(this.profesionalService.save(profesional));
    }
}
