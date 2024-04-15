package com.example.atenciones_medicas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idpa")
    private int idpa;

    @Column(name = "nombrespa")     
    private String nombrespa;

    @Column(name = "apellidospa")
    private String apellidospa;

    @Column(name = "rutpa")
    private String rutpa;

    @Column(name = "telpa")
    private String telpa;

    @Column(name = "fechanacimientopa")
    private String fechaNacimientopa;

    @Column(name = "correopa")
    private String correopa;

    @Column(name = "direccionpa")
    private String direccionpa;

     @Column(name = "comunapa")
    private String comunapa;

    @Column(name = "ciudadpa")
    private String ciudadpa;


    
 /*GET y SET*/
    public int getIdpa() {
        return this.idpa;
    }

    public void setIdpa(int idpa) {
        this.idpa = idpa;
    }

    public String getNombrespa() {
        return this.nombrespa;
    }

    public void setNombrespa(String nombrespa) {
        this.nombrespa = nombrespa;
    }

    public String getApellidospa() {
        return this.apellidospa;
    }

    public void setApellidospa(String apellidospa) {
        this.apellidospa = apellidospa;
    }

    public String getRutpa() {
        return this.rutpa;
    }

    public void setRutpa(String rutpa) {
        this.rutpa = rutpa;
    }

    public String getTelpa() {
        return this.telpa;
    }

    public void setTelpa(String telpa) {
        this.telpa = telpa;
    }

    public String getFechaNacimientopa() {
        return this.fechaNacimientopa;
    }

    public void setFechaNacimientopa(String fechaNacimientopa) {
        this.fechaNacimientopa = fechaNacimientopa;
    }

    public String getCorreopa() {
        return this.correopa;
    }

    public void setCorreopa(String correopa) {
        this.correopa = correopa;
    }

    public String getDireccionpa() {
        return this.direccionpa;
    }

    public void setDireccionpa(String direccionpa) {
        this.direccionpa = direccionpa;
    }

    public String getComunapa() {
        return this.comunapa;
    }

    public void setComunapa(String comunapa) {
        this.comunapa = comunapa;
    }

    public String getCiudadpa() {
        return this.ciudadpa;
    }

    public void setCiudadpa(String ciudadpa) {
        this.ciudadpa = ciudadpa;
    }
    

   


    

}
