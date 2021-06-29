package com.dbProjectJavaSpring.FUNBRA.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="solicitudadopcionpregunta")
public class SolicitudAdopcionPregunta implements Serializable {
    
    //Atributos
    @Id 
    @Column(name="idSolicitudAdopcion")
    private int idSolicitudAdopcionPK;
    @Id
    @Column(name="idPregunta")
    private int idPreguntaPK;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcionPregunta M:1 Pregunta)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idPreguntaPK", insertable=false, updatable=false)
    private SolicitudAdopcion solicitudesAdopcion;

    //RELACION CON DEMAS TABLAS (SolicitudAdopcionPregunta M:1 SolicitudAdopcion)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @ManyToOne
    @JoinColumn(name="idSolicitudAdopcionPK", insertable=false, updatable=false)
    private Pregunta preguntas;

    //Metodo Constructor Vacio
    public SolicitudAdopcionPregunta() {
    }

    //Metodo Constructor
    public SolicitudAdopcionPregunta(int idSolicitudAdopcionPK, int idPreguntaPK) {
        this.idSolicitudAdopcionPK = idSolicitudAdopcionPK;
        this.idPreguntaPK = idPreguntaPK;
    }

    //Getters and Setters
    public int getIdSolicitudAdopcionPK() {
        return idSolicitudAdopcionPK;
    }
    public void setIdSolicitudAdopcionPK(int idSolicitudAdopcionPK) {
        this.idSolicitudAdopcionPK = idSolicitudAdopcionPK;
    }
    public int getIdPreguntaPK() {
        return idPreguntaPK;
    }
    public void setIdPreguntaPK(int idPreguntaPK) {
        this.idPreguntaPK = idPreguntaPK;
    }    
}
