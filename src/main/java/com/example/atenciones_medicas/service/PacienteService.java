package com.example.atenciones_medicas.service;

import java.util.List;
import java.util.Optional;

import com.example.atenciones_medicas.model.Paciente;

public interface PacienteService {
    

    List<Paciente> getAllPaciente();
    Optional <Paciente> getPacienteById(int id_pa);

/*CREAR*/

Paciente createPaciente(Paciente paciente);
Paciente  updatePaciente(int id_pa, Paciente paciente);
void deletePaciente(int id_pa);  

}
