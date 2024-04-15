package com.example.atenciones_medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atenciones_medicas.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    //@Query(value= "SELECT pa.idpa FROM paciente pa LEFT OUTER JOIN atencion_medica atr ON pa.idpa = atr.idpa WHERE pa.idpa = ?1 ", nativeQuery = true) 
}


