package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="fotografia")
public class Fotografia {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idFotografia;
    @Column(name="foto")
    private Long foto;
    @Column(name="descripcionImagen", length=50)
    private String descripcionImagen;
    @Column(name="idAnimal_FK")
    private int idAnimalFK;

    //RELACION CON DEMAS TABLAS (Fotografia M:1 Animal)
    @ManyToOne
    @JoinColumn(name="idAnimal_FK", insertable=false, updatable=false)
    private Animal animales;

    //Metodo Constructor Vacio
    public Fotografia() {
    }

    //Metodo Constructor
    public Fotografia(int idFotografia, Long foto, String descripcionImagen, int idAnimalFK) {
        this.idFotografia = idFotografia;
        this.foto = foto;
        this.descripcionImagen = descripcionImagen;
        this.idAnimalFK = idAnimalFK;
    }

    //Getters and Setters
    public int getIdFotografia() {
        return idFotografia;
    }
    public void setIdFotografia(int idFotografia) {
        this.idFotografia = idFotografia;
    }
    public Long getFoto() {
        return foto;
    }
    public void setFoto(Long foto) {
        this.foto = foto;
    }
    public String getDescripcionImagen() {
        return descripcionImagen;
    }
    public void setDescripcionImagen(String descripcionImagen) {
        this.descripcionImagen = descripcionImagen;
    }
    public int getIdAnimalFK() {
        return idAnimalFK;
    }
    public void setIdAnimalFK(int idAnimalFK) {
        this.idAnimalFK = idAnimalFK;
    }   
}
