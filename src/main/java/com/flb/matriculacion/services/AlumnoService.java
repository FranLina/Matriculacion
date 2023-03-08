package com.flb.matriculacion.services;

import java.util.List;

import com.flb.matriculacion.models.Alumno;

public interface AlumnoService {
    public List<Alumno> findAll();

    public Alumno findById(int id);

    public Alumno save(Alumno alumno);

    public void update(int id, Alumno alumno);

    public void deleteById(int id);
}
