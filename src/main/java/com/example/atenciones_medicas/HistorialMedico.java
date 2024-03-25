package com.example.atenciones_medicas;



public class HistorialMedico  {
    private int idHistorialMedico;
    private String fechaAtencion;
    private String horaAtencion;
    private String especialista;
    private String medico;

    public HistorialMedico(int idHistorialMedico, String fechaAtencion, String horaAtencion, String especialista, String medico)
    {
        
        this.idHistorialMedico=idHistorialMedico;
        this.fechaAtencion=fechaAtencion;
        this.horaAtencion=horaAtencion;
        this.horaAtencion=horaAtencion;
        this.especialista=especialista;
        this.medico=medico;

    }

    public int getIdHistorialMedico() {
        return this.idHistorialMedico;
    }

    public String getFechaAtencion() {
        if(fechaAtencion=="" || fechaAtencion==null || fechaAtencion==" " )
        {
            return "La fecha de atencion no ha sido ingresada";
        }
        else{
            return this.fechaAtencion;
        }
        
    }

    public String getHoraAtencion() {
        if(horaAtencion=="" || horaAtencion==null || horaAtencion==" " )
        {
            return "La hora de atencion no ha sido ingresada";
        }
        else{
            return this.horaAtencion;
        }
        
    }

    public String getEspecialista() {
        if(especialista=="" || especialista==null || especialista==" " )
        {
            return "El especialista no ha sido ingresada";
        }
        else{
            return this.especialista;
        }
        
    }


    public String getMedico() {
        if(medico=="" || medico==null || medico==" " )
        {
            return "El Medico no ha sido ingresada";
        }
        else{
            return this.medico;
        }
        
    }

   
   
    
}
