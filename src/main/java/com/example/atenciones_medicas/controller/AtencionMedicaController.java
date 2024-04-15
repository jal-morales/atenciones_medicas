package com.example.atenciones_medicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.atenciones_medicas.model.AtencionMedica;
import com.example.atenciones_medicas.service.AtencionMedicaService;



@RestController
@RequestMapping("/atencion-medica")
public class AtencionMedicaController {

@Autowired
    private AtencionMedicaService atencionMedicaService;   

@PostMapping
public AtencionMedica createAtencionMedica(@RequestBody AtencionMedica atencionMedica){
    return atencionMedicaService.createAtencionMedica(atencionMedica);
}




}
