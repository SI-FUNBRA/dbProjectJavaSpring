package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="sede")
public class Sede {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idSede;
    @Column(name="idBarrio_FK")
    private int idBarrioFK; 
    @Column(name="telefonoCelularSede", length=20)   
    private String telefonoCelularSede; 
    @Column(name="correoSede", length=20)
    private String correoSede;
    @Column(name="nomenclatura", length=20)
    private String nomenclatura;

    //RELACION CON DEMAS TABLAS (Sede 1:M Cita)
    @OneToMany(mappedBy="sedes")
    private List<Cita> citas;

    //RELACION CON DEMAS TABLAS (Sede M:1 Barrio)
    @ManyToOne
    @JoinColumn(name="idBarrio_FK", insertable=false, updatable=false)
    private Barrio barrios;

    //RELACION CON DEMAS TABLAS (Sede 1:M Animal)
    @OneToMany(mappedBy="sedes")
    private List<Animal> animales;

    //Metodo Constructor Vacio
    public Sede() {
    }

    //Metodo Constructor
    public Sede(int idSede, int idBarrioFK, String telefonoCelularSede, String correoSede, String nomenclatura) {
        this.idSede = idSede;
        this.idBarrioFK = idBarrioFK;
        this.telefonoCelularSede = telefonoCelularSede;
        this.correoSede = correoSede;
        this.nomenclatura = nomenclatura;
    }

    //Getters and Setters
    public int getIdSede() {
        return idSede;
    }
    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }
    public int getIdBarrioFK() {
        return idBarrioFK;
    }
    public void setIdBarrioFK(int idBarrioFK) {
        this.idBarrioFK = idBarrioFK;
    }
    public String getTelefonoCelularSede() {
        return telefonoCelularSede;
    }
    public void setTelefonoCelularSede(String telefonoCelularSede) {
        this.telefonoCelularSede = telefonoCelularSede;
    }
    public String getCorreoSede() {
        return correoSede;
    }
    public void setCorreoSede(String correoSede) {
        this.correoSede = correoSede;
    }
    public String getNomenclatura() {
        return nomenclatura;
    }
    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    } 
}
