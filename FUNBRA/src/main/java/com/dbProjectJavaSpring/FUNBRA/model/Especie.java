package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="especie")
public class Especie {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEspecie;
    @Column(name="nombreEspecie", length=20)
    private String nombreEspecie;
    @Column(name="habitat")
    private String habitat;
    @Column(name="idTipoAnimal_FK")
    private int idTipoAnimalFK;

    //RELACION CON DEMAS TABLAS (Especie M:1 TipoAnimal)
    @ManyToOne
    @JoinColumn(name="idTipoAnimal_FK", insertable=false, updatable=false)
    private TipoAnimal tipoAnimales;

    //Metodo Constructor Vacio
    public Especie() {
    }

    //Metodo Constructor
    public Especie(int idEspecie, String nombreEspecie, String habitat, int idtipoAnimalFK) {
        this.idEspecie = idEspecie;
        this.nombreEspecie = nombreEspecie;
        this.habitat = habitat;
        idTipoAnimalFK = idtipoAnimalFK;
    }

    //Getters and Setters
    public int getIdEspecie() {
        return idEspecie;
    }
    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }
    public String getNombreEspecie() {
        return nombreEspecie;
    }
    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getidTipoAnimalFK() {
        return idTipoAnimalFK;
    }
    public void setidTipoAnimalFK(int idtipoAnimalFK) {
        idTipoAnimalFK = idtipoAnimalFK;
    }
}
