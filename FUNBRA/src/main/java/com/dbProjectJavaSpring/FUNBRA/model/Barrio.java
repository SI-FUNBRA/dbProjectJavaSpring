package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="barrio")
public class Barrio {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idBarrio;
    @Column(name="nombreBarrio", length=30)
    private String nombreBarrio;
    @Column(name="idLocalidad_FK")
    private int idLocalidadFK;

     //RELACION CON DEMAS TABLAS (Barrio 1:M Usuario)
     @OneToMany(mappedBy="barrios")
     private List<Usuario> Usuarios;

    //RELACION CON DEMAS TABLAS (Barrio M:1 Localidad)
    @ManyToOne
    @JoinColumn(name="idLocalidad_FK", insertable=false, updatable=false)
    private Localidad localidades;

    //RELACION CON DEMAS TABLAS (Barrio 1:M Sede)
    @OneToMany(mappedBy="barrios")
    private List<Sede> sedes;

    //Metodo Constructor Vacio
    public Barrio() {
    }

    //Metodo Constructor
    public Barrio(int idBarrio, String nombreBarrio, int idLocalidadFK) {
        this.idBarrio = idBarrio;
        this.nombreBarrio = nombreBarrio;
        this.idLocalidadFK = idLocalidadFK;
    }

    //Getters and Setters
    public int getIdBarrio() {
        return idBarrio;
    }
    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }
    public String getNombreBarrio() {
        return nombreBarrio;
    }
    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }
    public int getIdLocalidadFK() {
        return idLocalidadFK;
    }
    public void setIdLocalidadFK(int idLocalidadFK) {
        this.idLocalidadFK = idLocalidadFK;
    }
}
