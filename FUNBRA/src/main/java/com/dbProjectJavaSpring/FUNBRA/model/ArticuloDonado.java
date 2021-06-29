package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="articulodonado")
public class ArticuloDonado {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idArticuloDonado;
    @Column(name="nombreArticuloDonado", length=10)
    private String nombreArticuloDonado;
    @Column(name="cantidadArticuloDonado")
    private int cantidadArticuloDonado;
    @Column(name="idDonacionEspecie_FK")
    private int idDonacionEspecieFK;
    @Column(name="idTipoArticuloDonado_FK")
    private int idTipoArticuloDonadoFK;

    //RELACION CON DEMAS TABLAS (ArticuloDonado M:1 SolicitudDonacionEspecie)
    @ManyToOne
    @JoinColumn(name="idDonacionEspecie_FK", insertable=false, updatable=false)
    private SolicitudDonacionEspecie SolicitudesDonEspecie;

    //RELACION CON DEMAS TABLAS (ArticuloDonado M:1 TipoArticuloDonado)
    @ManyToOne
    @JoinColumn(name="idTipoArticuloDonado_FK", insertable=false, updatable=false)
    private TipoArticuloDonado TiposArticulosDonados;

    //Metodo Constructor Vacio
    public ArticuloDonado() {
    }
    
    //Metodo Constructor
    public ArticuloDonado(int idArticuloDonado, String nombreArticuloDonado, int cantidadArticuloDonado,
            int idDonacionEspecieFK, int idTipoArticuloDonadoFK) {
        this.idArticuloDonado = idArticuloDonado;
        this.nombreArticuloDonado = nombreArticuloDonado;
        this.cantidadArticuloDonado = cantidadArticuloDonado;
        this.idDonacionEspecieFK = idDonacionEspecieFK;
        this.idTipoArticuloDonadoFK = idTipoArticuloDonadoFK;
    }

    //Getters and Setters
    public int getIdArticuloDonado() {
        return idArticuloDonado;
    }
    public void setIdArticuloDonado(int idArticuloDonado) {
        this.idArticuloDonado = idArticuloDonado;
    }
    public String getNombreArticuloDonado() {
        return nombreArticuloDonado;
    }
    public void setNombreArticuloDonado(String nombreArticuloDonado) {
        this.nombreArticuloDonado = nombreArticuloDonado;
    }
    public int getCantidadArticuloDonado() {
        return cantidadArticuloDonado;
    }
    public void setCantidadArticuloDonado(int cantidadArticuloDonado) {
        this.cantidadArticuloDonado = cantidadArticuloDonado;
    }
    public int getIdDonacionEspecieFK() {
        return idDonacionEspecieFK;
    }
    public void setIdDonacionEspecieFK(int idDonacionEspecieFK) {
        this.idDonacionEspecieFK = idDonacionEspecieFK;
    }
    public int getIdTipoArticuloDonadoFK() {
        return idTipoArticuloDonadoFK;
    }
    public void setIdTipoArticuloDonadoFK(int idTipoArticuloDonadoFK) {
        this.idTipoArticuloDonadoFK = idTipoArticuloDonadoFK;
    }
}
