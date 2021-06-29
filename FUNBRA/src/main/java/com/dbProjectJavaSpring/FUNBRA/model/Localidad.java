package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="localidad")
public class Localidad {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idLocalidad;
    @Column(name="nombreLocalidad", length=30)
    private String nombreLocalidad;
    @Column(name="idCiudad_FK")
    private int idCiudadFK;

    //RELACION CON DEMAS TABLAS (Localidad 1:M Barrio)
    @OneToMany(mappedBy="localidades")
    private List<Barrio> barrios;

    //RELACION CON DEMAS TABLAS (Localidad M:1 Ciudad)
    @ManyToOne
    @JoinColumn(name="idCiudad_FK", insertable=false, updatable=false)
    private Ciudad ciudades;

    //Metodo Constructor Vacio
    public Localidad() {
    }

    //Metodo Constructor
    public Localidad(int idLocalidad, String nombreLocalidad, int idCiudadFK) {
        this.idLocalidad = idLocalidad;
        this.nombreLocalidad = nombreLocalidad;
        this.idCiudadFK = idCiudadFK;
    }

    //Getters and Setters
    public int getIdLocalidad() {
        return idLocalidad;
    }
    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    public String getNombreLocalidad() {
        return nombreLocalidad;
    }
    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }
    public int getIdCiudadFK() {
        return idCiudadFK;
    }
    public void setIdCiudadFK(int idCiudadFK) {
        this.idCiudadFK = idCiudadFK;
    } 
}
