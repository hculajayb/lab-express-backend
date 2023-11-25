package gt.edu.umg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Examenes_Id")
    private int examenesId;
    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Fecha_Creacion")
    private Timestamp fechaCreacion;

    @Column(name = "Fecha_Modificacion")
    private Timestamp fechaModificacion;

    @Column(name = "Creado_Por", nullable = false)

    private int creadoPor;
    @Column(name = "Modificado_Por")
    private int modificadoPor;
    @Column(name = "Estado")
    private int estado = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExamenesId() {
        return examenesId;
    }

    public void setExamenesId(int examenesId) {
        this.examenesId = examenesId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(int modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}


