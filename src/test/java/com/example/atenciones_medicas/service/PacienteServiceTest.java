package com.example.atenciones_medicas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.atenciones_medicas.model.Paciente;
import com.example.atenciones_medicas.repository.PacienteRepository;

@ExtendWith(MockitoExtension.class)
public class PacienteServiceTest {
    @InjectMocks
    private PacienteServiceImpl pacienteServicesImpl;

    @Mock
    private PacienteRepository  PacienteRepositoryMock;

     @Test
    public void guardarPacienteTest() {

        Paciente paciente = new Paciente();
        paciente.setNombrespa("Daniela");

        when(PacienteRepositoryMock.save(any())).thenReturn(paciente);

        Paciente resultado = pacienteServicesImpl.createPaciente(paciente);

        assertEquals("Daniela", resultado.getNombrespa());
    }
}
