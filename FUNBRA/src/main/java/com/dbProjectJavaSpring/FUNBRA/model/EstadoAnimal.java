package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="estadoanimal")
public class EstadoAnimal {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idEstadoAnimal;
    @Column(name="nombreEstadoAnimal", length=20)
    private String nombreEstadoAnimal;

    //RELACION CON DEMAS TABLAS (EstadoAnimal 1:M Animal)
    @OneToMany(mappedBy="estadoanimales")
    private List<Animal> animales;

    //Metodo Constructor Vacio
    public EstadoAnimal() {
    }

    //Metodo Constructor
    public EstadoAnimal(int idEstadoAnimal, String nombreEstadoAnimal) {
        this.idEstadoAnimal = idEstadoAnimal;
        this.nombreEstadoAnimal = nombreEstadoAnimal;
    }

    //Getters and Setters
    public int getIdEstadoAnimal() {
        return idEstadoAnimal;
    }
    public void setIdEstadoAnimal(int idEstadoAnimal) {
        this.idEstadoAnimal = idEstadoAnimal;
    }
    public String getNombreEstadoAnimal() {
        return nombreEstadoAnimal;
    }
    public void setNombreEstadoAnimal(String nombreEstadoAnimal) {
        this.nombreEstadoAnimal = nombreEstadoAnimal;
    }   
}
