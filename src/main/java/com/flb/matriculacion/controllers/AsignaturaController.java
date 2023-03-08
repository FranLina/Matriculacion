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

import com.flb.matriculacion.models.Asignatura;
import com.flb.matriculacion.services.AsignaturaService;

@RestController
public class AsignaturaController {
    @Autowired
    AsignaturaService aService;

    @GetMapping("/asignaturas")
    List<Asignatura> all() {
        return aService.findAll();
    }

    @GetMapping("asignaturas/{id}")
    Asignatura find(@PathVariable String id) {
        return aService.findById(id);
    }

    @DeleteMapping("/asignaturas/{id}")
    void delete(@PathVariable String id) {
        aService.deleteById(id);
    }

    @PostMapping("/asignaturas")
    Asignatura save(@RequestBody Asignatura asignatura) {
        return aService.save(asignatura);
    }

    @PutMapping("/asignaturas/{id}")
    void update(@PathVariable String id, @RequestBody Asignatura asignatura) {
        aService.update(id, asignatura);
    }
}
