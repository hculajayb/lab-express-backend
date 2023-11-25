package gt.edu.umg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name = "Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Usuario_Id")
    private Integer usuarioId;
    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "CUI")
    private String cui;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Fecha_Creacion")
    private java.sql.Timestamp fechaCreacion;
    @Column(name = "Fecha_Modificacion")
    private java.sql.Timestamp fechaModificacion;
    @Column(name = "Creado_Por", nullable = false)
    private int creadoPor;
    @Column(name = "Modificado_Por")
    private Integer modificadoPor;
    @Column(name = "Estado")
    private int estado = 1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(int creadoPor) {
        this.creadoPor = creadoPor;
    }

    public Integer getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(Integer modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}