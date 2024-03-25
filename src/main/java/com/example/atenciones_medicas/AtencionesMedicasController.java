package com.example.atenciones_medicas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
public class AtencionesMedicasController {
    

    private  List<Paciente> pacientes= new ArrayList<>();
    


    public AtencionesMedicasController()
    {
        
        pacientes.add(new Paciente(1, "Daniela Andrea", "Correa Palma", "10.256.256-8", "99255472", "23-08-1989",
         "Dannyela.Andrea@gmail.com", "Los Gorriones 1125", "Quilicura", "Santiago",
        Arrays.asList(new ConsultasMedicasAgendadas(1, "01-01-2023", "Medicina Interna", 10900, true,"Remoto")),
        Arrays.asList(new Atenciones(1, "Refriado Cronico", true, 1, "01-01-2023")), 
        Arrays.asList(new HistorialMedico(1, "01-06-2020", "10:45",
         "Traumatologo", "Felipe Riquelme"),new HistorialMedico(2, "25-04-2021", "11:15", "Medicina Interna", "Daniel Sanchez"),
         new HistorialMedico(3, "27-12-2024", "17:50", "Medicina Interna", "Daniel Sanchez"))));

         pacientes.add(new Paciente(2, "javier Antonio", "Correa Palma", "10.256.256-8", "99255472", "23-08-1989",
         "Dannyela.Andrea@gmail.com", "Los Gorriones 1125", "Quilicura", "Santiago",
        Arrays.asList(new ConsultasMedicasAgendadas(1, "01-01-2023", "Medicina Interna", 10900, true,"Remoto")),
        Arrays.asList(new Atenciones(1, "Refriado Cronico", true, 1, "01-01-2023")), 
        Arrays.asList(new HistorialMedico(1, "01-06-2020", "10:45",
         "Traumatologo", "Felipe Riquelme"),new HistorialMedico(2, "25-04-2021", "11:15", "Medicina Interna", "Daniel Sanchez"),
         new HistorialMedico(3, "27-12-2024", "17:50", "Medicina Interna", "Daniel Sanchez")))); 

         pacientes.add(new Paciente(3, "Jaime Felipe", "Correa Palma", "10.256.256-8", "99255472", "23-08-1989",
         "Dannyela.Andrea@gmail.com", "Los Gorriones 1125", "Quilicura", "Santiago",
        Arrays.asList(new ConsultasMedicasAgendadas(1, "01-01-2023", "Medicina Interna", 10900, true,"Remoto")),
        Arrays.asList(new Atenciones(1, "Refriado Cronico", true, 1, "01-01-2023")), 
        Arrays.asList(new HistorialMedico(1, "01-06-2020", "10:45",
         "Traumatologo", "Felipe Riquelme"),new HistorialMedico(2, "25-04-2021", "11:15", "Medicina Interna", "Daniel Sanchez"),
         new HistorialMedico(3, "27-12-2024", "17:50", "Medicina Interna", "Daniel Sanchez")))); 
          
    }

   

  @GetMapping("/atencionMedica/")
  public List<Paciente> paciente(){
    return pacientes;
  }

  @GetMapping("/atencionMedica/{id}")
  public ResponseEntity getPacientesById(@PathVariable int id) {
              
      for(Paciente paciente: pacientes)
      {
          if (paciente.getId()==id) {
              return ResponseEntity.ok(paciente);
          }
  
      }
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontrol el id del paciente");
  }
  


  


}
