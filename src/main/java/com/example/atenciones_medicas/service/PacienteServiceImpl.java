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
   public Optional<Paciente> getPacienteById(int id_pa){

    return pacienteRepository.findById(id_pa);
   }

@Override
public Paciente createPaciente(Paciente paciente)
{

    return pacienteRepository.save(paciente);
}

@Override
public Paciente  updatePaciente(int id_pa, Paciente paciente){
    if(pacienteRepository.existsById(id_pa)){
        paciente.setIdpa(id_pa);
        return pacienteRepository.save(paciente);
    }
    else{
        return null;
    }
    
}

@Override
public void deletePaciente(int id_pa){
    pacienteRepository.deleteById(id_pa);
}
/* 
@Override
public List<Paciente> getAllPacientesConAtenciones() {
    return pacienteRepository.findAllWithAtencionesMedicas();
}*/

}
