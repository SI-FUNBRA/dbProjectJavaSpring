package com.dbProjectJavaSpring.FUNBRA.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="animaltratamiento")
public class AnimalTratamiento implements Serializable {
    
    //Atributos
    @Id
    @Column(name="idAnimal")
    private int idAnimalPK;
    @Id
    @Column(name="idTratamiento")
    private int idTratamientoPK;
    @Column(name="progreso", length=500)
    private String progreso;
    @Column(name="fechaInicioTratamiento")
    private Date fechaInicioTratamiento;
    @Column(name="estado", length=1)
    private int estado;

    //RELACION CON DEMAS TABLAS (AnimalTratamiento M:1 Animal)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idAnimal", insertable=false, updatable=false)
    private Tratamiento tratamientos;

    //RELACION CON DEMAS TABLAS (AnimalTratamiento M:1 Animal)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idTratamiento", insertable=false, updatable=false)
    private Animal animales;

    //Metodo Constructor Vacio
    public AnimalTratamiento() {
    }

    //Metodo Constructor
    public AnimalTratamiento(int idAnimalPK, int idTratamientoPK, String progreso, Date fechaInicioTratamiento,
            int estado) {
        this.idAnimalPK = idAnimalPK;
        this.idTratamientoPK = idTratamientoPK;
        this.progreso = progreso;
        this.fechaInicioTratamiento = fechaInicioTratamiento;
        this.estado = estado;
    }

    //Getters and Setters
    public int getIdAnimalPK() {
        return idAnimalPK;
    }
    public void setIdAnimalPK(int idAnimalPK) {
        this.idAnimalPK = idAnimalPK;
    }
    public int getIdTratamientoPK() {
        return idTratamientoPK;
    }
    public void setIdTratamientoPK(int idTratamientoPK) {
        this.idTratamientoPK = idTratamientoPK;
    }
    public String getProgreso() {
        return progreso;
    }
    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }
    public Date getFechaInicioTratamiento() {
        return fechaInicioTratamiento;
    }
    public void setFechaInicioTratamiento(Date fechaInicioTratamiento) {
        this.fechaInicioTratamiento = fechaInicioTratamiento;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
