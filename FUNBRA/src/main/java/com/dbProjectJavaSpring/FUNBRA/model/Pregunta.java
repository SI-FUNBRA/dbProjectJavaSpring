package com.dbProjectJavaSpring.FUNBRA.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="pregunta")
public class Pregunta {

    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name="DescripcionPregunta", length=500)
    private String DescripcionPregunta;

    //RELACION CON DEMAS TABLAS (Pregunta 1:M Respuesta)
    @OneToMany(mappedBy="preguntas")
    private List<Respuesta> respuestas;

    //RELACION CON DEMAS TABLAS (Pregunta 1:M SolicitudAdopcionPregunta)
    //TABLA GENERADA POR LA RELACION DE M:M -> TABLA DEBIL
    @OneToMany(mappedBy="preguntas")
    private List<SolicitudAdopcionPregunta> solicitudesAdopcionesPreguntas;

    //Metodo Constructor Vacio
    public Pregunta() {
    }

    //Metodo Constructor
    public Pregunta(int idPregunta, String descripcionPregunta) {
        this.idPregunta = idPregunta;
        DescripcionPregunta = descripcionPregunta;
    }

    //Getters and Setters
    public int getIdPregunta() {
        return idPregunta;
    }
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    public String getDescripcionPregunta() {
        return DescripcionPregunta;
    }
    public void setDescripcionPregunta(String descripcionPregunta) {
        DescripcionPregunta = descripcionPregunta;
    }
}
