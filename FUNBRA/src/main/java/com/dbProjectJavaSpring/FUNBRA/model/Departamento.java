package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="departamento")
public class Departamento {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(name="nombreDepartamento", length=30)
    private String nombreDepartamento;
    @Column(name="idPais_FK")
    private int idPaisFK;

    //RELACION CON DEMAS TABLAS (Departamento 1:M Ciudad)
    @OneToMany(mappedBy="departamentos")
    private List<Ciudad> ciudades;

    //RELACION CON DEMAS TABLAS (Departamento M:1 Pais)
    @ManyToOne
    @JoinColumn(name="idPaisFK")
    private Pais paises;

    //Metodo Constructor Vacio
    public Departamento() {
    }

    //Metodo Constructor
    public Departamento(int idDepartamento, String nombreDepartamento, int idPaisFK) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.idPaisFK = idPaisFK;
    }

    //Getters and Setters
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public int getIdPaisFK() {
        return idPaisFK;
    }
    public void setIdPaisFK(int idPaisFK) {
        this.idPaisFK = idPaisFK;
    }
}
