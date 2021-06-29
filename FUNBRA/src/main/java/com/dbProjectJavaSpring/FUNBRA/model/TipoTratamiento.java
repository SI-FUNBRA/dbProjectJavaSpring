package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tipotratamiento")
public class TipoTratamiento {
    
    //Atributos
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoTratamiento;
    @Column(name="nombreTipoTratamiento", length=20)
    private String nombreTipoTratamiento;

     //RELACION CON DEMAS TABLAS (TipoTratamiento 1:M Tratamiento)
     @OneToMany(mappedBy="tipoTratamientos")
     private List<Tratamiento> tratamientos;

    //Metodo Constructor Vacio
    public TipoTratamiento() {
    }

    //Metodo Constructor
    public TipoTratamiento(int idTipoTratamiento, String nombreTipoTratamiento) {
        this.idTipoTratamiento = idTipoTratamiento;
        this.nombreTipoTratamiento = nombreTipoTratamiento;
    }

    //Getters and Setters
    public int getIdTipoTratamiento() {
        return idTipoTratamiento;
    }
    public void setIdTipoTratamiento(int idTipoTratamiento) {
        this.idTipoTratamiento = idTipoTratamiento;
    }
    public String getNombreTipoTratamiento() {
        return nombreTipoTratamiento;
    }
    public void setNombreTipoTratamiento(String nombreTipoTratamiento) {
        this.nombreTipoTratamiento = nombreTipoTratamiento;
    } 
}
