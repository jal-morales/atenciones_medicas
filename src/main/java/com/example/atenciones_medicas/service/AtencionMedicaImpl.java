package com.example.atenciones_medicas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atenciones_medicas.model.AtencionMedica;
import com.example.atenciones_medicas.repository.AtencionMedicaRepository;

@Service
public class AtencionMedicaImpl implements AtencionMedicaService {
@Autowired  
    private  AtencionMedicaRepository atencionMedicaRepository;    

@Override
public AtencionMedica createAtencionMedica(AtencionMedica atencionMedica)
{

    return atencionMedicaRepository.save(atencionMedica);
}

@Override
public AtencionMedica  updateAtencionMedica(int id_am, AtencionMedica atencionMedica){
    if(atencionMedicaRepository.existsById(id_am)){
        atencionMedica.setIdam(id_am);
        return atencionMedicaRepository.save(atencionMedica);
    }
    else{
        return null;
    }
    
}

}

    
