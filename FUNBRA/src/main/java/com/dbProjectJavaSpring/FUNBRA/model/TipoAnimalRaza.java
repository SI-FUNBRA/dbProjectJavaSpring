package com.dbProjectJavaSpring.FUNBRA.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tipoanimalraza")
public class TipoAnimalRaza implements Serializable{
    
    //Atributos
    @Id
    @Column(name="idTipoAnimal")
    private int idTipoAnimalPK;
    @Id
    @Column(name="idRaza")
    private int idRazaPK;

    //RELACION CON DEMAS TABLAS (TipoAnimalRaza M:1 TipoAnimal)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idTipoAnimal", insertable=false, updatable=false)
    private Raza razasA;

    //RELACION CON DEMAS TABLAS (TipoAnimalRaza M:1 Raza)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idRaza", insertable=false, updatable=false)
    private TipoAnimal tiposAnimales;
    
    
    //Metodo Constructor Vacio
    public TipoAnimalRaza() {
    }

    //Metodo Constructor
    public TipoAnimalRaza(int idTipoAnimalPK, int idRazaPK) {
        this.idTipoAnimalPK = idTipoAnimalPK;
        this.idRazaPK = idRazaPK;
    }

    //Getters and Setters
    public int getIdTipoAnimalPK() {
        return idTipoAnimalPK;
    }
    public void setIdTipoAnimalPK(int idTipoAnimalPK) {
        this.idTipoAnimalPK = idTipoAnimalPK;
    }
    public int getIdRazaPK() {
        return idRazaPK;
    }
    public void setIdRazaPK(int idRazaPK) {
        this.idRazaPK = idRazaPK;
    } 
}
