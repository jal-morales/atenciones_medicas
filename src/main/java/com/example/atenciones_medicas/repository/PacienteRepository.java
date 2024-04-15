package com.example.atenciones_medicas.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.atenciones_medicas.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    /*@Query("SELECT DISTINCT p FROM Paciente p LEFT JOIN FETCH p.atencionesMedicas")
    List<Paciente> findAllWithAtencionesMedicas();*/
  
}


