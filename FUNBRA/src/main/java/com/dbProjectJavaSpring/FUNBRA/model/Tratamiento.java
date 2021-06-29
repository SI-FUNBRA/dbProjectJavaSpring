package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tratamiento")
public class Tratamiento {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTratamiento;
    @Column(name="nombreTratamiento", length=20)
    private String nombreTratamiento;
    @Column(name="detalleTratamiento", length=500)
    private String detalleTratamiento;
    @Column(name="idTipoTratamiento_FK")
    private int idTipoTratamientoFK;
    @Column(name="estado", length=1)
    private int estado;

     //RELACION CON DEMAS TABLAS (Tratamiento M:1 TipoTratamiento)
     @ManyToOne
     @JoinColumn(name="idTipoTratamiento_FK", insertable=false, updatable=false)
     private TipoTratamiento tipoTratamientos;

     //RELACION CON DEMAS TABLAS (Tratamiento 1:M AnimalTratamiento)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="tratamientos")
    private List<AnimalTratamiento> animalesTratamiento;

    //Metodo Constructor Vacio
    public Tratamiento() {
    }

    //Metodo Constructor 
    public Tratamiento(int idTratamiento, String nombreTratamiento, String detalleTratamiento, int idtipoTratamientoFK,
            int estado) {
        this.idTratamiento = idTratamiento;
        this.nombreTratamiento = nombreTratamiento;
        this.detalleTratamiento = detalleTratamiento;
        idTipoTratamientoFK = idtipoTratamientoFK;
        this.estado = estado;
    }

    //Getters and Setters
    public int getIdTratamiento() {
        return idTratamiento;
    }
    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }
    public String getNombreTratamiento() {
        return nombreTratamiento;
    }
    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }
    public String getDetalleTratamiento() {
        return detalleTratamiento;
    }
    public void setDetalleTratamiento(String detalleTratamiento) {
        this.detalleTratamiento = detalleTratamiento;
    }
    public int getidTipoTratamientoFK() {
        return idTipoTratamientoFK;
    }
    public void setidTipoTratamientoFK(int idtipoTratamientoFK) {
        idTipoTratamientoFK = idtipoTratamientoFK;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
