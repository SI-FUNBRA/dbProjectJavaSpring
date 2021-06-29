package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="metododepago")
public class MetodoDePago {
    
    //Atributos
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idMetodoPago;
    @Column(name="nombreMetodoPago", length=10)
    private String nombreMetodoPago;
    @Column(name="idDonacionEconomica_FK")
    private int idDonacionEconomicaFK;

    //RELACION CON DEMAS TABLAS (Metodo de pago M:1 DonacionEconomica)
    @ManyToOne
    @JoinColumn(name="idDonacionEconomica_FK", insertable=false, updatable=false)
    private DonacionEconomica DonEcon;

    //Metodo Constructor vacio
    public MetodoDePago() {
    }

    //Metodo constructor
    public MetodoDePago(int idMetodoPago, String nombreMetodoPago) {
        this.idMetodoPago = idMetodoPago;
        this.nombreMetodoPago = nombreMetodoPago;
    }

    //Getters and Setters
    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    public void setNombreMetodoPago(String nombreMetodoPago) {
        this.nombreMetodoPago = nombreMetodoPago;
    } 
}
