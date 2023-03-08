package com.flb.matriculacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flb.matriculacion.models.Alumno;
import com.flb.matriculacion.services.AlumnoService;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService aService;

    @GetMapping("/alumnos")
    List<Alumno> all() {
        return aService.findAll();
    }

    @GetMapping("alumnos/{id}")
    Alumno find(@PathVariable int id) {
        Alumno a = aService.findById(id);
        return a;
    }

    @DeleteMapping("/alumnos/{id}")
    void delete(@PathVariable int id) {
        aService.deleteById(id);
    }

    @PostMapping("/alumnos")
    Alumno save(@RequestBody Alumno alumno) {
        return aService.save(alumno);
    }

    @PutMapping("/alumnos/{id}")
    void update(@PathVariable int id, @RequestBody Alumno alumno) {
        aService.update(id, alumno);
    }
}
