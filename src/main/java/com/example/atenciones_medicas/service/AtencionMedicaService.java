package com.example.atenciones_medicas.service;

import com.example.atenciones_medicas.model.AtencionMedica;

public interface AtencionMedicaService {

    AtencionMedica createAtencionMedica(AtencionMedica atencionMedica);
    AtencionMedica updateAtencionMedica(int id_am, AtencionMedica atencionMedica);

}
