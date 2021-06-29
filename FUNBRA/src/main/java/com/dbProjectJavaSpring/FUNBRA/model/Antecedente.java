package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="antecedente")
public class Antecedente {
    
    //Atrubutos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idAntecedente;
    @Column(name="detalleAntecedente", length=500)
    private String detalleAntecedente;
    @Column(name="estadoAntecedente", length=1)
    private int estadoAntecedente;
    @Column(name="idAnimal_FK")
    private int idAnimalFK;
    @Column(name="idTipoAntecedente_FK")
    private int idTipoAntecedenteFK;

    //RELACION CON DEMAS TABLAS (Antecedente M:1 TipoAntecedente)
    @ManyToOne
    @JoinColumn(name="idTipoAntecedente_FK", insertable=false, updatable=false)
    private TipoAntecedente tipoAntecedentes;

    //RELACION CON DEMAS TABLAS (Antecedente 1:M AnimalAntecedente)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="antecedentesA")
    private List<AnimalAntecedente> animalesAntecedentes;
    
    //Metodo Constructor Vacio
    public Antecedente() {
    }

    //Metodo Constructor
    public Antecedente(int idAntecedente, String detalleAntecedente, int estadoAntecedente, int idAnimalFK,
            int idTipoAntecedenteFK) {
        this.idAntecedente = idAntecedente;
        this.detalleAntecedente = detalleAntecedente;
        this.estadoAntecedente = estadoAntecedente;
        this.idAnimalFK = idAnimalFK;
        this.idTipoAntecedenteFK = idTipoAntecedenteFK;
    }

    //Getters and Setters
    public int getIdAntecedente() {
        return idAntecedente;
    }
    public void setIdAntecedente(int idAntecedente) {
        this.idAntecedente = idAntecedente;
    }
    public String getDetalleAntecedente() {
        return detalleAntecedente;
    }
    public void setDetalleAntecedente(String detalleAntecedente) {
        this.detalleAntecedente = detalleAntecedente;
    }
    public int getEstadoAntecedente() {
        return estadoAntecedente;
    }
    public void setEstadoAntecedente(int estadoAntecedente) {
        this.estadoAntecedente = estadoAntecedente;
    }
    public int getIdAnimalFK() {
        return idAnimalFK;
    }
    public void setIdAnimalFK(int idAnimalFK) {
        this.idAnimalFK = idAnimalFK;
    }
    public int getIdTipoAntecedenteFK() {
        return idTipoAntecedenteFK;
    }
    public void setIdTipoAntecedenteFK(int idTipoAntecedenteFK) {
        this.idTipoAntecedenteFK = idTipoAntecedenteFK;
    }  
}
