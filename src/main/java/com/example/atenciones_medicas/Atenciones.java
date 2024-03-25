package com.example.atenciones_medicas;


public class Atenciones {
    private int idAtencion;
    private String diasnostco;
    private boolean reposo;
    private int diasReposo;
    private String fechaAtencion;

    public Atenciones(int idAtencion, String diasnostco, boolean reposo, int diasReposo, String fechaAtencion)
    {
        this.idAtencion=idAtencion;
        this.diasnostco=diasnostco;
        this.reposo=reposo;
        this.diasReposo=diasReposo;
        this.fechaAtencion=fechaAtencion;
    }  

    public int getIdAtencion() {
        return this.idAtencion;
    }

    public String getDiasnostco() {
        if(diasnostco=="" || diasnostco==null || diasnostco==" " )
        {
            return "El diagnostico no ha sido ingresada";
        }
        else{
            return this.diasnostco;
        }
        
    }

    public boolean isReposo() {
        return this.reposo;
    }


    public int getDiasReposo() {
        return this.diasReposo;
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


    

    


}
