package com.dbProjectJavaSpring.FUNBRA.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="animalantecedente")
public class AnimalAntecedente implements Serializable {
    
    //Atributos
    @Id
    @Column(name="idAnimal")
    private int idAnimalPK;
    @Id
    @Column(name="idAntecedente")
    private int idAntecedentePK;

    //RELACION CON DEMAS TABLAS (AnimalAntecedente M:1 Animal)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idAnimal", insertable=false, updatable=false)
    private Antecedente antecedentesA;

    //RELACION CON DEMAS TABLAS (AnimalAntecedente M:1 Antecedente)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idAntecedente", insertable=false, updatable=false)
    private Animal animales;

    //Metodo Constructor Vacio
    public AnimalAntecedente() {
    }

    //Metodo Constructor
    public AnimalAntecedente(int idAnimalPK, int idAntecedentePK) {
        this.idAnimalPK = idAnimalPK;
        this.idAntecedentePK = idAntecedentePK;
    }

    //Getters and Setters
    public int getIdAnimalPK() {
        return idAnimalPK;
    }
    public void setIdAnimalPK(int idAnimalPK) {
        this.idAnimalPK = idAnimalPK;
    }
    public int getIdAntecedentePK() {
        return idAntecedentePK;
    }
    public void setIdAntecedentePK(int idAntecedentePK) {
        this.idAntecedentePK = idAntecedentePK;
    }
}
