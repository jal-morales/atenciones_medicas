package com.example.atenciones_medicas;

import java.sql.Date;

public class ConsultasMedicasAgendadas  {
    private int idConsulta;
    private String fechaConsulta;
    private String especialista;
    private int valorConsulta;
    private boolean consultaTomada;
    private String tipoConsulta;

    public ConsultasMedicasAgendadas(int idConsulta, String fechaConsulta,String especialista, int valorConsulta, boolean consultaTomada, String tipoConsulta )
    {

        this.idConsulta=idConsulta;
        this.fechaConsulta=fechaConsulta;
        this.especialista=especialista;
        this.valorConsulta=valorConsulta;
        this.consultaTomada=consultaTomada;
        this.tipoConsulta=tipoConsulta;
    }

    public int getIdConsulta() {
        
        return this.idConsulta;
    }

    public String getFechaConsulta() {
        if(fechaConsulta=="" || fechaConsulta==null || fechaConsulta==" " )
        {
            return "La fecha no ha sido ingresada";
        }
        else{
            return this.fechaConsulta;
        }
        
    }

    public String getEspecialista() {
        if(especialista=="" || especialista==null || especialista==" " )
        {
            return "La especialidad no ha sido ingresada";
        }
        else{
            return this.especialista;
        }
       
    }

    public int getValorConsulta() {
        
        return this.valorConsulta;
    }

    public boolean isConsultaTomada() {
      
        return this.consultaTomada;
    }

    public String getTipoConsulta() {
        if(tipoConsulta=="" || tipoConsulta==null || tipoConsulta==" " )
        {
            return "El tipo de consulta no ha sido ingresada";
        }
        else{
            return this.tipoConsulta;
        }
        
    }

    

    



}
