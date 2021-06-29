package com.dbProjectJavaSpring.FUNBRA.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="nombreUsuario", length=25)
    private String nombreUsuario;
    @Column(name="apellidoUsuario", length=25) 
    private String apellidoUsuario;
    @Column(name="correoUsuario", length=30)
    private String correoUsuario;
    @Column(name="telefonoFijo", length=20)
    private String telefonoFijo;
    @Column(name="telefonoCelular", length=20)
    private String telefonoCelular;
    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;
    @Column(name="idTipoDocumento_FK")
    private int idTipoDocumentoFK;
    @Column(name="numeroDocumento", length=10)
    private String numeroDocumento;
    @Column(name="fechaExpedicionDoc", length=20)
    private Date fechaExpedicionDoc;
    @Column(name="lugarExpedicionDoc_FK")
    private int lugarExpedicionDocFK;
    @Column(name="idBarrio_FK")
    private int idBarrioFK;
    @Column(name="idTipoUsuario_FK")
    private int idTipoUsuarioFK;
    @Column(name="estadoUsuario", length=1)
    private int estadoUsuario;

    //RELACION CON DEMAS TABLAS (Usuario 1:M DonacionEconomica)
    @OneToMany(mappedBy="Usuarios")
    private List<DonacionEconomica> DonacionesEconomicas;

    //RELACION CON DEMAS TABLAS (Usuario M:1 TipoUsuario)
    @ManyToOne
    @JoinColumn(name="idTipoUsuario_FK", insertable=false, updatable=false)
    private TipoUsuario tipousuario;

    //RELACION CON DEMAS TABLAS (Usuario 1:M Credenciales)
    @OneToMany(mappedBy="Usuarios")
    private List<Credenciales> Credencial;

    //RELACION CON DEMAS TABLAS (Usuario 1:M SolicitudDonacionEspecie)
    @OneToMany(mappedBy="Usuarios")
    private List<SolicitudDonacionEspecie> SolicitudesDonacionesEspecie;

    //RELACION CON DEMAS TABLAS (Usuario M:1 TipoDocumento)
    @ManyToOne
    @JoinColumn(name="idTipoDocumento_FK", insertable=false, updatable=false)
    private TipoDocumento TipoDoc;

    //RELACION CON DEMAS TABLAS (Usuario M:1 Barrio)
    @ManyToOne
    @JoinColumn(name="idBarrio_FK", insertable=false, updatable=false)
    private Barrio barrios;

    //RELACION CON DEMAS TABLAS (Usuario 1:M SolicitudAdopcion)
    @OneToMany(mappedBy="Usuarios")
    private List<SolicitudAdopcion> solicitudesAdopciones;

    //RELACION CON DEMAS TABLAS (Usuario M:1 Ciudad)
    @ManyToOne
    @JoinColumn(name="lugarExpedicionDoc_FK", insertable=false, updatable=false)
    private Ciudad ciudades;

    //Metodo Constructor vacio
    public Usuario() {
    }
    
    //Metodo Constructor
    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String telefonoFijo, String telefonoCelular, Date fechaNacimiento, int tipoDocumentoFK,
            String numeroDocumento, Date fechaExpedicion, int lugarExpedicionDocCiudadFK, int idBarrioFK,
            int idTipoUsuarioFK, int estado) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumentoFK = tipoDocumentoFK;
        this.numeroDocumento = numeroDocumento;
        this.fechaExpedicionDoc = fechaExpedicion;
        this.lugarExpedicionDocFK = lugarExpedicionDocCiudadFK;
        this.idBarrioFK = idBarrioFK;
        this.idTipoUsuarioFK = idTipoUsuarioFK;
        this.estadoUsuario = estado;
    }

    //Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getidTipoDocumentoFK() {
        return idTipoDocumentoFK;
    }

    public void setidTipoDocumentoFK(int idTipoDocumentoFK) {
        this.idTipoDocumentoFK = idTipoDocumentoFK;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaExpedicionDoc() {
        return fechaExpedicionDoc;
    }

    public void setFechaExpedicionDoc(Date fechaExpedicionDoc) {
        this.fechaExpedicionDoc = fechaExpedicionDoc;
    }

    public int getLugarExpedicionDocFK() {
        return lugarExpedicionDocFK;
    }

    public void setLugarExpedicionDocFK(int lugarExpedicionDocFK) {
        this.lugarExpedicionDocFK = lugarExpedicionDocFK;
    }

    public int getIdBarrioFK() {
        return idBarrioFK;
    }

    public void setIdBarrioFK(int idBarrioFK) {
        this.idBarrioFK = idBarrioFK;
    }

    public int getIdTipoUsuarioFK() {
        return idTipoUsuarioFK;
    }

    public void setIdTipoUsuarioFK(int idTipoUsuarioFK) {
        this.idTipoUsuarioFK = idTipoUsuarioFK;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    } 
}
