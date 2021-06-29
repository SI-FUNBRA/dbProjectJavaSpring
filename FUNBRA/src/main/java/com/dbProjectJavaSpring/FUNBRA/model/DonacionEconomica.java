package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="donacioneconomica")
public class DonacionEconomica {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDonacionEconomica;
    @Column(name="fechaDonacion")
    private Date fechaDonacion;
    @Column(name="montoDonacion", length=10)
    private Float montoDonacion;
    @Column(name="idUsuario_FK")
    private int idUsuarioFK;

    //RELACION CON DEMAS TABLAS ( DonacionEconomica 1:M MetodoDePago)
    @OneToMany(mappedBy="DonEcon")
    private List<MetodoDePago> MetodosDePago;

    //RELACION CON DEMAS TABLAS (DonacionEconomica M:1 Usuario)
    @ManyToOne
    @JoinColumn(name="idUsuario_FK", insertable=false, updatable=false)
    private Usuario Usuarios;


    //Metodo Constructor vacio
    public DonacionEconomica() {
    }

    //Metodo Constructor
    public DonacionEconomica(int idDonacionEconomica, Date fechaDonacion, Float montoDonacion) {
        this.idDonacionEconomica = idDonacionEconomica;
        this.fechaDonacion = fechaDonacion;
        this.montoDonacion = montoDonacion;
    }

    //Getters and Setters
    public int getIdDonacionEconomica() {
        return idDonacionEconomica;
    }
    public void setIdDonacionEconomica(int idDonacionEconomica) {
        this.idDonacionEconomica = idDonacionEconomica;
    }
    public Date getFechaDonacion() {
        return fechaDonacion;
    }
    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }
    public Float getMontoDonacion() {
        return montoDonacion;
    }
    public void setMontoDonacion(Float montoDonacion) {
        this.montoDonacion = montoDonacion;
    }
}
