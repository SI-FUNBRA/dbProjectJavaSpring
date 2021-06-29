package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="tipousuario")
public class TipoUsuario {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoUsuario;
    @Column(name="nombreTipoUsuario", length=15)
    private String nombreTipoUsuario;

    //RELACION CON DEMAS TABLAS (TipoUsuario 1:M Usuario)
    @OneToMany(mappedBy="tipousuario")
    private List<Usuario> Usuarios; 

    //RELACION CON DEMAS TABLAS (TipoUsuario 1:M Rol) 
    @OneToMany(mappedBy="tipousuario")
    private List<Rol> Roles;
    
    //Metodo Constructor Vacio
    public TipoUsuario() {
    }

    //Metodo Constructor
    public TipoUsuario(int idTipoUsuario, 
        String nombreTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    //Getters and Setters
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }
    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }
}
