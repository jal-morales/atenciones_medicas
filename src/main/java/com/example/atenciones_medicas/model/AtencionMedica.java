package com.example.atenciones_medicas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "atencion_medica")
public class AtencionMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idam")
    private int idam;
    
    @Column(name = "diasnostcoam")
    private String diasnostcoam;

    @Column(name = "reposoam")
    private String reposoam;

    @Column(name = "diasreposoam")
    private int diasreposoam;

    @Column(name = "fechaatencionam")
    private String fechaAtencionam;

    @Column(name = "idpa")
    private int idpa;

/*haciendo join
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idpa")
private Paciente paciente;*/


    
/*GET Y SET*/

public int getIdam() {
    return this.idam;
}

public void setIdam(int idam) {
    this.idam = idam;
}

public String getDiasnostcoam() {
    return this.diasnostcoam;
}

public void setDiasnostcoam(String diasnostcoam) {
    this.diasnostcoam = diasnostcoam;
}

public String isReposoam() {
    return this.reposoam;
}

public void setReposoam(String reposoam) {
    this.reposoam = reposoam;
}

public int getDiasreposoam() {
    return this.diasreposoam;
}

public void setDiasReposoam(int diasreposoam) {
    this.diasreposoam = diasreposoam;
}

public String getFechaAtencionam() {
    return this.fechaAtencionam;
}

public void setFechaAtencionam(String fechaAtencionam) {
    this.fechaAtencionam = fechaAtencionam;
}

public int getIdpa() {
    return this.idpa;
}

public void setIdpa(int idpa) {
    this.idpa = idpa;
}

/* 
public Paciente getPaciente() {
    return this.paciente;
}

public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
}*/


}
