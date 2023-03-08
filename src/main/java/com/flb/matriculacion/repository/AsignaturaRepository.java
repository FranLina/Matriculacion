package com.flb.matriculacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.matriculacion.models.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, String> {

}
