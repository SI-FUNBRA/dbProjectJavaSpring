package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="solicituddonacionespecie")
public class SolicitudDonacionEspecie {

    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDonacionEspecie;
    @Column(name="estadoSolicitud", length=10)
    private String estadoSolicitud;
    @Column(name="fechaEntrega")
    private Date fechaEntrega;
    @Column(name="idUsuario_FK")
    private int idUsuarioFK;
    @Column(name="lugarEntrega", length=70)
    private String lugarEntrega;

    //RELACION CON DEMAS TABLAS (SolicitudDonacionEspecie M:1 Usuario)
    @ManyToOne
    @JoinColumn(name="idUsuario_FK", insertable=false, updatable=false)
    private Usuario Usuarios;

    //RELACION CON DEMAS TABLAS (SolicitudDonacionEspecie 1:M ArticuloDonado)
    @OneToMany(mappedBy="SolicitudesDonEspecie")
    private List<ArticuloDonado> ArticulosDonados; 

    //Metodo Constructor Vacio
    public SolicitudDonacionEspecie() {
    }

    //Metodo Constructor
    public SolicitudDonacionEspecie(int idDonacionEspecie, String estadoSolicitud, Date fechaEntrega, int idUsuarioFK,
            String lugarEntrega) {
        this.idDonacionEspecie = idDonacionEspecie;
        this.estadoSolicitud = estadoSolicitud;
        this.fechaEntrega = fechaEntrega;
        this.idUsuarioFK = idUsuarioFK;
        this.lugarEntrega = lugarEntrega;
    }

    //Metodo Constructor
    public int getIdDonacionEspecie() {
        return idDonacionEspecie;
    }
    public void setIdDonacionEspecie(int idDonacionEspecie) {
        this.idDonacionEspecie = idDonacionEspecie;
    }
    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }
    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }
    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }
    public String getLugarEntrega() {
        return lugarEntrega;
    }
    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }
}
