package com.example.atenciones_medicas.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.atenciones_medicas.model.AtencionMedica;



@ExtendWith(MockitoExtension.class)
public class AtencionMedicaRepositoryTest {
    
     @Autowired
    private AtencionMedicaRepository atencionMedicaRepository;

    @Test
    public void createAtencionMedica() {
      
        AtencionMedica atencionMedica = new AtencionMedica();
        /*Aca seteamos datos del paciente  */
        atencionMedica.setDiasReposoam(18);;
   
   
        
        AtencionMedica resultado = atencionMedicaRepository.save(atencionMedica);
        assertEquals(18, resultado.getDiasreposoam());
    } 
}
