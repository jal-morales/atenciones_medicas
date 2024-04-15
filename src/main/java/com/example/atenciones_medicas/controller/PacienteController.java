package com.example.atenciones_medicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.atenciones_medicas.model.Paciente;
import com.example.atenciones_medicas.service.PacienteService;

@RestController
@RequestMapping("/Pacientes")
public class PacienteController {
@Autowired
private PacienteService pacienteService;



@GetMapping
public List<Paciente> getAllRegistroUsuarios() {
    return pacienteService.getAllPaciente();
} 

@PostMapping
public Paciente createPaciente(@RequestBody Paciente paciente){
    return pacienteService.createPaciente(paciente);
}


@PutMapping("/{id}")
public Paciente  updatePaciente(@PathVariable int id, @RequestBody Paciente paciente) {
    
    return pacienteService.updatePaciente(id, paciente);
}


@DeleteMapping("/{id}")
public  void deletePaciente(@PathVariable int id){
    
    try {
        pacienteService.deletePaciente(id);
        new ResponseEntity<>("Pelicula Eliminada Correctamente",HttpStatus.OK);     
    } catch (Exception e) {
        new ResponseEntity<>("Error al eliminar la pelicula id:"+id,HttpStatus.BAD_REQUEST);  
    }     
}




}
