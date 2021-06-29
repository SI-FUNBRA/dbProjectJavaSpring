package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="pais")
public class Pais {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPais;
    @Column(name="nombrePais", length=30)
    private String nombrePais;

    //RELACION CON DEMAS TABLAS (Pais 1:M Departamento)
    @OneToMany(mappedBy="paises")
    private List<Departamento> departamentos;

    //Metodo Constructor Vacio
    public Pais() {
    }

    //Metodo Constructor 
    public Pais(int idPais, String nombrePais) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
    }

    //Getters and Setters
    public int getIdPais() {
        return idPais;
    }
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
