package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="ciudad")
public class Ciudad {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCiudad;
    @Column(name="nombreCiudad", length=30)
    private String nombreCiudad;
    @Column(name="idDepartamento_FK")
    private int idDepartamentoFK;

    //RELACION CON DEMAS TABLAS (Ciudad 1:M Localidad)
    @OneToMany(mappedBy="ciudades")
    private List<Localidad> localidades;

    //RELACION CON DEMAS TABLAS (Ciudad M:1 Departamento)
    @ManyToOne
    @JoinColumn(name="idDepartamento_FK", insertable=false, updatable=false)
    private Departamento departamentos;

    //RELACION CON DEMAS TABLAS (Ciudad 1:M Usuario)
    @OneToMany(mappedBy="ciudades")
    private List<Usuario> usuarios;

    //Metodo Constructor Vacio
    public Ciudad() {
    }

    //Metodo Constructor 
    public Ciudad(int idCiudad, String nombreCiudad, int idDepartamentoFK) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.idDepartamentoFK = idDepartamentoFK;
    }

    //Getters and Setters
    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public int getIdDepartamentoFK() {
        return idDepartamentoFK;
    }
    public void setIdDepartamentoFK(int idDepartamentoFK) {
        this.idDepartamentoFK = idDepartamentoFK;
    }
}
