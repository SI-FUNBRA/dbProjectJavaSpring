package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="credenciales")
public class Credenciales {
    
    //Atributos
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int idCredenciales;
     @Column(name="username", length=10)
     private String username;
     @Column(name="pass", length=10)
     private String pass;
     @Column(name="idUsuario_FK")
     private int idUsuarioFK;

     //RELACION CON DEMAS TABLAS (Credenciales M:1 Usuario)
     @ManyToOne
     @JoinColumn(name="idUsuario_FK", insertable=false, updatable=false)
     private Usuario Usuarios;

    //Metodo Constructor Vacio
    public Credenciales() {
    }

    //Metodo Constructor
    public Credenciales(int idCredenciales, String username, String pass, int idUsuarioFK) {
        this.idCredenciales = idCredenciales;
        this.username = username;
        this.pass = pass;
        this.idUsuarioFK = idUsuarioFK;
    }

    //Getters and Setters
    public int getIdCredenciales() {
        return idCredenciales;
    }
    public void setIdCredenciales(int idCredenciales) {
        this.idCredenciales = idCredenciales;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }
    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }
}
