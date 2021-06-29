package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idRol;
    @Column(name="nombreRol", length=15)
    private String nombreRol;
    @Column(name="idTipoUsuario_FK")
    private int idTipoUsuarioFK;

    //RELACION CON DEMAS TABLAS (Rol M:1 TipoUsuario) 
    @ManyToOne
    @JoinColumn(name="idTipoUsuario_FK", insertable=false, updatable=false)
    private TipoUsuario tipousuario;  

    //Metodos Constructor Vacio
    public Rol() {
    }

    //Metodo Constructor 
    public Rol(int idRol, 
    String nombreRol
    , int idTipoUsuarioFK
    , TipoUsuario tipousuario
    ) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.idTipoUsuarioFK = idTipoUsuarioFK;
        //Agregar la inicializacion de la relacion de (Rol M:1 TipoUsuario) sobre el constructor
        this.tipousuario = tipousuario;
    }

    //Getters and Setters
    public int getIdRol() {
        return idRol;
    }
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public String getNombreRol() {
        return nombreRol;
    }
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    public int getIdTipoUsuarioFK() {
        return idTipoUsuarioFK;
    }
    public void setIdTipoUsuarioFK(int idTipoUsuarioFK) {
        this.idTipoUsuarioFK = idTipoUsuarioFK;
    }

    //Agregar la relacion de (Rol M:1 TipoUsuario) sobre los Getters and Setters  
    public TipoUsuario getTipousuario() {
        return tipousuario;
    }
    public void setTipousuario(TipoUsuario tipousuario) {
        this.tipousuario = tipousuario;
    }
}
