package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="raza")
public class Raza {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idRaza;
    @Column(name="nombre")
    private String nombreRaza;

    //RELACION CON DEMAS TABLAS (Raza 1:M TipoAnimalRaza)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="razasA")
    private List<TipoAnimalRaza> tiposAnimalesRaza;

    //Metodo Constructor Vacio
    public Raza() {
    }

    //Metodo Constructor 
    public Raza(int idRaza, String nombreRaza) {
        this.idRaza = idRaza;
        this.nombreRaza = nombreRaza;
    }

    //Getters and Setters
    public int getIdRaza() {
        return idRaza;
    }
    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }
    public String getNombreRaza() {
        return nombreRaza;
    }
    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
}
