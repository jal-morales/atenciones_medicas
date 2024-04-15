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
@Table(name = "atencion_medica")
public class AtencionMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idam")
    private int idAtencion;
    
    @Column(name = "diasnostcoam")
    private String diasnostco;

    @Column(name = "reposoam")
    private boolean reposo;

    @Column(name = "diasReposoam")
    private int diasReposo;

    @Column(name = "fechaAtencionam")
    private String fechaAtencion;

    
/*GET Y SET*/
    public int getIdAtencion() {
        return this.idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public String getDiasnostco() {
        return this.diasnostco;
    }

    public void setDiasnostco(String diasnostco) {
        this.diasnostco = diasnostco;
    }

    public boolean isReposo() {
        return this.reposo;
    }

    public void setReposo(boolean reposo) {
        this.reposo = reposo;
    }

    public int getDiasReposo() {
        return this.diasReposo;
    }

    public void setDiasReposo(int diasReposo) {
        this.diasReposo = diasReposo;
    }

    public String getFechaAtencion() {
        return this.fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

}
