package com.example.atenciones_medicas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atenciones_medicas.model.Paciente;
import com.example.atenciones_medicas.repository.PacienteRepository;



@Service
public class PacienteServiceImpl implements PacienteService {
@Autowired  
private  PacienteRepository pacienteRepository;

@Override
public List<Paciente> getAllPaciente(){
    return pacienteRepository.findAll();
}

@Override
   public Optional<Paciente> getPacienteById(int idpa){

    return pacienteRepository.findById(idpa);
   }

@Override
public Paciente createPaciente(Paciente paciente)
{

    return pacienteRepository.save(paciente);
}

@Override
public Paciente  updatePaciente(int idpa, Paciente paciente){
    if(pacienteRepository.existsById(idpa)){
        paciente.setIdpa(idpa);
        return pacienteRepository.save(paciente);
    }
    else{
        return null;
    }
    
}

@Override
public void deletePaciente(int idpa){
    pacienteRepository.deleteById(idpa);
}
/* 
@Override
public List<Paciente> getAllPacientesConAtenciones() {
    return pacienteRepository.findAllWithAtencionesMedicas();
}*/

}
