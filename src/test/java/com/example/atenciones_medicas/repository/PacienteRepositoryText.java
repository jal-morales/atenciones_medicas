package com.example.atenciones_medicas.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.atenciones_medicas.model.Paciente;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PacienteRepositoryText {
    
    @Autowired
    private PacienteRepository pacienteRepository;

    @Test
    public void createPaciente() {
       /*Aca creamos un objeto Paciente  */ 
        Paciente paciente = new Paciente();
        /*Aca seteamos datos del paciente  */
        paciente.setNombrespa("Dany");
        paciente.setRutpa("10.256.256-8");
        
   
        /*Aca hacemos una variable de tipo Pacienbte donde donde almacenaremos*/
        Paciente resultado = pacienteRepository.save(paciente);

        /*Aca estamos usando una clase de Junit donde estamos validando que el ID de la pelicula no sea nulo */
        assertNotNull(resultado.getNombrespa());
        /*Aca estamos pasando el valor que esperamos, usamos el get de la variable resultado para obtener el dato del objeto */
        assertEquals("Dany", resultado.getNombrespa());
    } 
}
