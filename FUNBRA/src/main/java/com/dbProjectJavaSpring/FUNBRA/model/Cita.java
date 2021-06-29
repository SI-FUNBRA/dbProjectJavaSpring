package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="cita")
public class Cita {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCita;
    @Column(name="fechaCita")
    private Date fechaCita;
    @Column(name="motivoCita", length=300)
    private String motivoCita;
    @Column(name="idSede_FK")
    private int idSedeFK;

    //RELACION CON DEMAS TABLAS (Cita M:1 Sede)
    @ManyToOne
    @JoinColumn(name="idSede_FK", insertable=false, updatable=false)
    private Sede sedes;

    //RELACION CON DEMAS TABLAS (Cita 1:1 SolicitudAdopcion)
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idSolicitudAdopcion", unique=true, insertable=false, updatable=false)    
    private SolicitudAdopcion solicitudesAdpciones;
    
    //Metodo Constructor Vacio
    public Cita() {
    }

    //Metodo Constructor 
    public Cita(int idCita, Date fechaCita, String motivoCita, int idSedeFK) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.motivoCita = motivoCita;
        this.idSedeFK = idSedeFK;
    }

    //Getters and Setters
    public int getIdCita() {
        return idCita;
    }
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public String getMotivoCita() {
        return motivoCita;
    }
    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
    public int getIdSedeFK() {
        return idSedeFK;
    }
    public void setIdSedeFK(int idSedeFK) {
        this.idSedeFK = idSedeFK;
    }
}
