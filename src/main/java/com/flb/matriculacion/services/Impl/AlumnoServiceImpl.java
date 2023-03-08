package com.flb.matriculacion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.matriculacion.models.Alumno;
import com.flb.matriculacion.repository.AlumnoRepository;
import com.flb.matriculacion.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno findById(int id) {
        Optional<Alumno> findById = alumnoRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void update(int id, Alumno alumno) {
        this.findById(id);
        alumno.setId(id);
        alumnoRepository.save(alumno);
    }

    @Override
    public void deleteById(int id) {
        alumnoRepository.deleteById(id);
    }

}
