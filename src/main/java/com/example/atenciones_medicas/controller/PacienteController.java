package com.example.atenciones_medicas.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
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
@RequestMapping("/pacientes")
public class PacienteController {
 private static final Logger log = LoggerFactory.getLogger(PacienteController.class);    
@Autowired
private PacienteService pacienteService;


/*
@GetMapping
public List<Paciente> getAllPacientes() {
    return pacienteService.getAllPaciente();
} */




@GetMapping
public CollectionModel<EntityModel<Paciente>> getAllPaciente() {
    List<Paciente> registroPacientes = pacienteService.getAllPaciente();
    if(registroPacientes.isEmpty()){
        return null;
    }

    log.info("GET /pacientes");
    log.info("Retornando todos los pacientes");

    log.info("LOG VACIO",registroPacientes.get(0));

    List<EntityModel<Paciente>> PacienteResourse = registroPacientes.stream()
            .map(registroPaciente -> EntityModel.of(registroPaciente, WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
                    .getPacienteById(registroPaciente.getId_pa())).withSelfRel()))
            .collect(Collectors.toList());

    WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllPaciente());
    CollectionModel<EntityModel<Paciente>> resources = CollectionModel.of(PacienteResourse, linkTo.withRel("registroPaciente"));

    return resources;
}





/*Get Paciente */
@GetMapping("/{id_pacientes}")
public EntityModel<Paciente>  getPacienteById(@PathVariable("id_pacientes") int id_pa) {


    Optional<Paciente> registroPaciente = pacienteService.getPacienteById(id_pa);
    if (registroPaciente.isPresent()) {
        return EntityModel.of(registroPaciente.get(),
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacienteById(id_pa)).withSelfRel(),
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllPaciente()).withRel("all-RegistroUsuario"));
    } else {
        throw new PacienteNotFoundException("id paciente no existe: " + id_pa);
    } 
}

@PostMapping
public Paciente createPaciente(@RequestBody Paciente paciente){
    return pacienteService.createPaciente(paciente);
}


@PutMapping("/{id}")
public Paciente  updatePaciente(@PathVariable int id_pa, @RequestBody Paciente paciente) {
    
    return pacienteService.updatePaciente(id_pa, paciente);
}


@DeleteMapping("/{id}")
public  void deletePaciente(@PathVariable int id_pa){
    
    try {
        pacienteService.deletePaciente(id_pa);
        new ResponseEntity<>("Pelicula Eliminada Correctamente",HttpStatus.OK);     
    } catch (Exception e) {
        new ResponseEntity<>("Error al eliminar la pelicula id:"+id_pa,HttpStatus.BAD_REQUEST);  
    }     
}




}
