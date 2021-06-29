package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="animal")
public class Animal {
    
    //Atributo
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idAnimal;
    @Column(name="nombreAnimal", length=25)
    private String nombreAnimal;
    @Column(name="edadAnimal")
    private int edadAnimal;
    @Column(name="fechaLlegada")
    private Date fechaLlegada;
    @Column(name="idSede_FK")
    private int idSedeFK;
    @Column(name="historialTratamiento", length=500)
    private String historialTratamiento;
    @Column(name="idEstadoAnimal_FK")
    private int idEstadoAnimalFK;
    @Column(name="idTipoAnimal_FK")
    private int idTipoAnimalFK;

    //RELACION CON DEMAS TABLAS (Animal 1:M SolicitudAdopcion)
    @OneToMany(mappedBy="animales")
    private List<SolicitudAdopcion> solicitudesAdopciones;

    //RELACION CON DEMAS TABLAS (Animal M:1 EstadoAnimal)
    @ManyToOne
    @JoinColumn(name="idEstadoAnimal_FK", insertable=false, updatable=false)
    private EstadoAnimal estadoanimales;

    //RELACION CON DEMAS TABLAS (Animal M:1 EstadoAnimal)
    @ManyToOne
    @JoinColumn(name="idTipoAnimal_FK", insertable=false, updatable=false)
    private TipoAnimal tipoAnimales;

    //RELACION CON DEMAS TABLAS (Animal 1:M Fotografia)
    @OneToMany(mappedBy="animales")
    private List<Fotografia> fotografias;

    //RELACION CON DEMAS TABLAS (Animal M:1 Sede)
    @ManyToOne
    @JoinColumn(name="idSede_FK", insertable=false, updatable=false)
    private Sede sedes;

    //RELACION CON DEMAS TABLAS (Animal 1:M AnimalAntecedente)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="animales")
    private List<AnimalAntecedente> animalesAntecedentes;

    //RELACION CON DEMAS TABLAS (Animal 1:M AnimalTratamiento)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="animales")
    private List<AnimalTratamiento> animalesTratamiento;


    //Metodo Constructor Vacio
    public Animal() {
    }

    //Metodo Constructor 
    public Animal(int idAnimal, String nombreAnimal, int edadAnimal, Date fechaLlegada, int idSedeFK,
            String historialTratamiento, int idEstadoAnimalFK, int idTipoAnimalFK) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.edadAnimal = edadAnimal;
        this.fechaLlegada = fechaLlegada;
        this.idSedeFK = idSedeFK;
        this.historialTratamiento = historialTratamiento;
        this.idEstadoAnimalFK = idEstadoAnimalFK;
        this.idTipoAnimalFK = idTipoAnimalFK;
    }

    //Getters and Setters
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getIdSedeFK() {
        return idSedeFK;
    }

    public void setIdSedeFK(int idSedeFK) {
        this.idSedeFK = idSedeFK;
    }

    public String getHistorialTratamiento() {
        return historialTratamiento;
    }

    public void setHistorialTratamiento(String historialTratamiento) {
        this.historialTratamiento = historialTratamiento;
    }

    public int getIdEstadoAnimalFK() {
        return idEstadoAnimalFK;
    }

    public void setIdEstadoAnimalFK(int idEstadoAnimalFK) {
        this.idEstadoAnimalFK = idEstadoAnimalFK;
    }

    public int getIdTipoAnimalFK() {
        return idTipoAnimalFK;
    }

    public void setIdTipoAnimalFK(int idTipoAnimalFK) {
        this.idTipoAnimalFK = idTipoAnimalFK;
    }
}
