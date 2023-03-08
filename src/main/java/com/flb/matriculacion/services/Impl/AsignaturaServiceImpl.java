package com.flb.matriculacion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.matriculacion.models.Asignatura;
import com.flb.matriculacion.repository.AsignaturaRepository;
import com.flb.matriculacion.services.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    @Autowired
    AsignaturaRepository aRepository;

    @Override
    public List<Asignatura> findAll() {
        return aRepository.findAll();
    }

    @Override
    public Asignatura findById(String id) {
        Optional<Asignatura> findById = aRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return aRepository.save(asignatura);
    }

    @Override
    public void update(String id, Asignatura asignatura) {
        this.findById(id);
        asignatura.setCodigo(id);
        aRepository.save(asignatura);
    }

    @Override
    public void deleteById(String id) {
        aRepository.deleteById(id);
    }

}
