package com.dbProjectJavaSpring.FUNBRA.model;

import javax.persistence.*;

@Entity
@Table(name="respuesta")
public class Respuesta {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name="DescripcionRespuesta", length=500)
    private String DescripcionRespuesta;
    @Column(name="idPregunta_FK")
    private int idPreguntaFK;

    //RELACION CON DEMAS TABLAS (Respuesta M:1 Pregunta)
    @ManyToOne
    @JoinColumn(name="idPreguntaFK", insertable=false, updatable=false)
    private Pregunta preguntas;

    //Metodo Constructor Vacio
    public Respuesta() {
    }

    //Metodo Constructor 
    public Respuesta(int idRespuesta, String descripcionRespuesta, int idPreguntaFK) {
        this.idRespuesta = idRespuesta;
        DescripcionRespuesta = descripcionRespuesta;
        this.idPreguntaFK = idPreguntaFK;
    }

    //Metodo Constructor
    public int getIdRespuesta() {
        return idRespuesta;
    }
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }
    public String getDescripcionRespuesta() {
        return DescripcionRespuesta;
    }
    public void setDescripcionRespuesta(String descripcionRespuesta) {
        DescripcionRespuesta = descripcionRespuesta;
    }
    public int getIdPreguntaFK() {
        return idPreguntaFK;
    }
    public void setIdPreguntaFK(int idPreguntaFK) {
        this.idPreguntaFK = idPreguntaFK;
    }
}
