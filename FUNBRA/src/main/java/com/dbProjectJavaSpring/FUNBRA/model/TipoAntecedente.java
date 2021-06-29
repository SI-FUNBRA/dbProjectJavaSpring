package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="tipoantecedente")
public class TipoAntecedente {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoAntecedente;
    @Column(name="nombre", length=20)
    private String nombre;

    //RELACION CON DEMAS TABLAS (TipoAntecedente 1:M Antecedente)
    @OneToMany(mappedBy="tipoAntecedentes")
    private List<Antecedente> antecedentes;

    //Metodo Constructor Vacio
    public TipoAntecedente() {
    }

    //Metodo Constructor
    public TipoAntecedente(int idTipoAntecedente, String nombre) {
        this.idTipoAntecedente = idTipoAntecedente;
        this.nombre = nombre;
    }

    //Getters and Setters
    public int getIdTipoAntecedente() {
        return idTipoAntecedente;
    }
    public void setIdTipoAntecedente(int idTipoAntecedente) {
        this.idTipoAntecedente = idTipoAntecedente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
