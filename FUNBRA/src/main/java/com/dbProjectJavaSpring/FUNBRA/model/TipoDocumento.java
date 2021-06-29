package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tipodocumento")
public class TipoDocumento {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoDocumento;
    @Column(name="nombreTipoDocumento", length=10)
    private String nombreTipoDocumento;

    //RELACION CON DEMAS TABLAS (TipoDocumento 1:M Usuario)
    @OneToMany(mappedBy="TipoDoc")
    private List<Usuario> Usuarios;

    //Metodo Constructor Vacio
    public TipoDocumento() {
    }

    //Metodo Constructor
    public TipoDocumento(int idTipoDocumento, String nombreTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    //Getters and Setters
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }
    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }
    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    } 
}
