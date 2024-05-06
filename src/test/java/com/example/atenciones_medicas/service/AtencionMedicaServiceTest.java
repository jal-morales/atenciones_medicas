package com.example.atenciones_medicas.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.atenciones_medicas.model.AtencionMedica;
import com.example.atenciones_medicas.repository.AtencionMedicaRepository;



@ExtendWith(MockitoExtension.class)
public class AtencionMedicaServiceTest {
    
    @InjectMocks
    private AtencionMedicaImpl atencionMedicaImpl;

    @Mock
    private AtencionMedicaRepository  AtencionMedicaRepositoryMock;

    @Test
    public void guardarAtencionMedicaTest() {

        AtencionMedica atencionMedica = new AtencionMedica();
        atencionMedica.setDiasReposoam(15);

        when(AtencionMedicaRepositoryMock.save(any())).thenReturn(atencionMedica);

        AtencionMedica resultado = atencionMedicaImpl.createAtencionMedica(atencionMedica);

        assertEquals(15, resultado.getDiasreposoam());
    }
}
