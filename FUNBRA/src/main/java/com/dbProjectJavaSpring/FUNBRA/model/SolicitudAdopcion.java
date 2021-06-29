package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="solicitudadopcion")
public class SolicitudAdopcion {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idSolicitudAdopcion;
    @Column(name="estadoSolicitud", length=20)
    private String estadoSolicitud;
    @Column(name="fechaSolicitud")
    private Date fechaSolicitud;
    @Column(name="idAnimal_FK")
    private int idAnimalFK;
    @Column(name="idUsuario_FK")
    private int idUsuarioFK;
    @Column(name="idCita_FK")
    private int idCitaFK;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcion M:1 Usuario)
    @ManyToOne
    @JoinColumn(name="idUsuario_FK", insertable=false, updatable=false)
    private Usuario Usuarios;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcion 1:1 Cita)
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idCita_FK", unique=true, insertable=false, updatable=false)    
    private Cita citas;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcion M:1 Animal)
    @ManyToOne
    @JoinColumn(name="idAnimal_FK", insertable=false, updatable=false)
    private Animal animales;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcion 1:M SolicitudAdopcionPregunta)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="solicitudesAdopcion")
    private List<SolicitudAdopcionPregunta> solicitudesAdopcionesPreguntas;

    //Metodo Constructor Vacio
    public SolicitudAdopcion() {
    }

    //Metodo Constructor
    public SolicitudAdopcion(int idSolicitudAdopcion, String estadoSolicitud, Date fechaSolicitud,
            String ocupacionAdoptante, int idAnimalFK, int idUsuarioFK, int idCitaFK) {
        this.idSolicitudAdopcion = idSolicitudAdopcion;
        this.estadoSolicitud = estadoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.idAnimalFK = idAnimalFK;
        this.idUsuarioFK = idUsuarioFK;
        this.idCitaFK = idCitaFK;
    }

    //Getters and Setters
    public int getIdSolicitudAdopcion() {
        return idSolicitudAdopcion;
    }
    public void setIdSolicitudAdopcion(int idSolicitudAdopcion) {
        this.idSolicitudAdopcion = idSolicitudAdopcion;
    }
    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }
    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    public int getIdAnimalFK() {
        return idAnimalFK;
    }
    public void setIdAnimalFK(int idAnimalFK) {
        this.idAnimalFK = idAnimalFK;
    }
    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }
    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }
    public int getIdCitaFK() {
        return idCitaFK;
    }
    public void setIdCitaFK(int idCitaFK) {
        this.idCitaFK = idCitaFK;
    }
}
