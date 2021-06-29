package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="tipoanimal")
public class TipoAnimal {
    
    //Atrubutos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoAnimal;
    @Column(name="nombreTipoAnimal", length=20)
    private String nombreTipoAnimal;

    //RELACION CON DEMAS TABLAS (TipoAnimal 1:M Animal)
    @OneToMany(mappedBy="tipoAnimales")
    private List<Animal> animales;

    //RELACION CON DEMAS TABLAS (TipoAnimal 1:M Especie)
    @OneToMany(mappedBy="tipoAnimales")
    private List<Especie> especies;

    //RELACION CON DEMAS TABLAS (TipoAnimal 1:M TipoAnimalRaza)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="tiposAnimales")
    private List<TipoAnimalRaza> tiposAnimalesRaza;

    //Metodo Constructor Vacio
    public TipoAnimal() {
    }

    //Metodo Constructor 
    public TipoAnimal(int idTipoAnimal, String nombreTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
        this.nombreTipoAnimal = nombreTipoAnimal;
    }

    //Getters and Setters
    public int getIdTipoAnimal() {
        return idTipoAnimal;
    }
    public void setIdTipoAnimal(int idTipoAnimal) {
        this.idTipoAnimal = idTipoAnimal;
    }
    public String getNombreTipoAnimal() {
        return nombreTipoAnimal;
    }
    public void setNombreTipoAnimal(String nombreTipoAnimal) {
        this.nombreTipoAnimal = nombreTipoAnimal;
    }
}
