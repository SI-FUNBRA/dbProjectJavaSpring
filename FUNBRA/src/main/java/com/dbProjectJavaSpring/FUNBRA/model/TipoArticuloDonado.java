package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="tipoarticulodonado")
public class TipoArticuloDonado {
    
    //Atributos
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoArticuloDonado;
    @Column(name="nombreTipoArticulo",length=25)
    private String nombreTipoArticulo;

    //RELACION CON DEMAS TABLAS (TipoArticuloDonado 1:M ArticuloDonado)
    @OneToMany(mappedBy="TiposArticulosDonados")
    private List<ArticuloDonado> ArticulosDonados;

    //Metodo Constructor vacio
    public TipoArticuloDonado() {
    }

    //Metodo Constructor 
    public TipoArticuloDonado(int idTipoArticuloDonado, String nombreTipoArticulo) {
        this.idTipoArticuloDonado = idTipoArticuloDonado;
        this.nombreTipoArticulo = nombreTipoArticulo;
    }

    //Getters and Setters
    public int getIdTipoArticuloDonado() {
        return idTipoArticuloDonado;
    }
    public void setIdTipoArticuloDonado(int idTipoArticuloDonado) {
        this.idTipoArticuloDonado = idTipoArticuloDonado;
    }
    public String getNombreTipoArticulo() {
        return nombreTipoArticulo;
    }
    public void setNombreTipoArticulo(String nombreTipoArticulo) {
        this.nombreTipoArticulo = nombreTipoArticulo;
    }
}
