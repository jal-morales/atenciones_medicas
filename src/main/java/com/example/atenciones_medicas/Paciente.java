package com.example.atenciones_medicas;

import java.util.List;

public class Paciente {
    private int id;
    private String nombres;
    private String apellidos;
    private String rut;
    private String tel;
    private String fechaNacimiento;
    private String correo;
    private String direccion;
    private String comuna;
    private String ciudad;
    private List<ConsultasMedicasAgendadas> consultasMedicasAgendadas;
    private List<Atenciones> atenciones;
    private List<HistorialMedico> historialMedico;

    public Paciente(int id, String nombre, String apellidos,String rut, String tel, String fechaNacimiento, String correo,String direccion, String comuna,
    String ciudad, List<ConsultasMedicasAgendadas> consultasMedicasAgendadas,List<Atenciones> atenciones,List<HistorialMedico> historialMedico)
   {
      this.id=id;
      this.nombres=nombre;
      this.apellidos=apellidos;
      this.rut=rut;
      this.tel=tel;
      this.fechaNacimiento=fechaNacimiento;
      this.correo=correo;
      this.direccion=direccion;
      this.comuna=comuna;
      this.ciudad=ciudad;
      this.consultasMedicasAgendadas=consultasMedicasAgendadas;
      this.atenciones=atenciones;
      this.historialMedico=historialMedico;
   }

    public int getId() {
        return this.id;
    }

    public String getNombres() {
        if(nombres=="" || nombres==null || nombres==" " )
        {
            return "El nombre no ha sido ingresado";
        }
        else{
            return this.nombres;
        }
       
    }

    public String getApellidos() {
        if(apellidos=="" || apellidos==null || apellidos==" " )
        {
            return "Los apeliidos no ha sido ingresado";
        }
        else{
            return this.apellidos;
        }
        
    }


    public String getRut() {
        if(rut=="" || rut==null || rut==" " )
        {
            return "El rut no ha sido ingresado";
        }
        else{
            return this.rut;
        }
        
    }


    public String getTel() {
        if(tel=="" || tel==null || tel==" " )
        {
            return "El telefono no ha sido ingresado";
        }
        else{
            return this.tel;
        }
      
    }

    public String getFechaNacimiento() {
        if(fechaNacimiento=="" || fechaNacimiento==null || fechaNacimiento==" " )
        {
            return "La fecha de nacimiento no ha sido ingresado";
        }
        else{
            return this.fechaNacimiento;
        }
       
    }

    public String getCorreo() {
        if(correo=="" || correo==null || correo==" " )
        {
            return "El correo no ha sido ingresado";
        }
        else{
            return this.correo;
        }
       
    }

    public String getDireccion() {
        if(direccion=="" || direccion==null || direccion==" " )
        {
            return "La direccion no ha sido ingresado";
        }
        else{
            return this.direccion;
        }
        
    }

    public String getComuna() {
        if(comuna=="" || comuna==null || comuna==" " )
        {
            return "La comuna no ha sido ingresado";
        }
        else{
            return this.comuna;
        }
        
    }

    public String getCiudad() {
        if(ciudad=="" || ciudad==null || ciudad==" " )
        {
            return "La ciudad no ha sido ingresado";
        }
        else{
            return this.ciudad;
        }
        
    }


    public List<ConsultasMedicasAgendadas> getConsultasMedicasAgendadas() {
        return this.consultasMedicasAgendadas;
    }


    public List<Atenciones> getAtenciones() {
        return this.atenciones;
    }


    public List<HistorialMedico> getHistorialMedico() {
        return this.historialMedico;
    }




  

   

}
