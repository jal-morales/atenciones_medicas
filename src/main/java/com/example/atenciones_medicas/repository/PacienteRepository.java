package com.example.atenciones_medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atenciones_medicas.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    
}


