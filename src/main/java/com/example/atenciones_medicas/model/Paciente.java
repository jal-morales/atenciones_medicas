package com.example.atenciones_medicas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name = "paciente")
public class Paciente {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idpa")
    private int id_pa;

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

    /*agregando join
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private List<AtencionMedica> atencionesMedicas;

    public List<AtencionMedica> getAtencionesMedicas() {
        return this.atencionesMedicas;
    }

    public void setAtencionesMedicas(List<AtencionMedica> atencionesMedicas) {
        this.atencionesMedicas = atencionesMedicas;
    }*/


    
 /*GET y SET*/
    public int getId_pa() {
        return this.id_pa;
    }

    public void setId_pa(int id_pa) {
        this.id_pa = id_pa;
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
