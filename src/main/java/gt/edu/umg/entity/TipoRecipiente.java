package gt.edu.umg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name = "Tipo_Recipientes")
public class TipoRecipiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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