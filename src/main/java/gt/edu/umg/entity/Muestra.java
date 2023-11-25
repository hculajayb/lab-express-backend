package gt.edu.umg.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "muestras")
public class Muestra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Solicitud_Id", nullable = false)
    private int solicitudId;

    @Column(name = "Tipo_Muestra_Id", nullable = false)
    private int tipoMuestraId;

    @Column(name = "Unidad_Medida_Id", nullable = false)
    private int unidadMedidaId;

    @Column(name = "Tipo_Recipiente_Id", nullable = false)
    private int tipoRecipienteId;

    @Column(name = "Etiqueta", nullable = false, length = 50)
    private String etiqueta;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "Cantidad", nullable = false)
    private int cantidad;

    @Column(name = "Fecha_Hora_Vencimiento", nullable = false)
    private Date fechaHoraVencimiento;

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

	public int getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(int solicitudId) {
		this.solicitudId = solicitudId;
	}

	public int getTipoMuestraId() {
		return tipoMuestraId;
	}

	public void setTipoMuestraId(int tipoMuestraId) {
		this.tipoMuestraId = tipoMuestraId;
	}

	public int getUnidadMedidaId() {
		return unidadMedidaId;
	}

	public void setUnidadMedidaId(int unidadMedidaId) {
		this.unidadMedidaId = unidadMedidaId;
	}

	public int getTipoRecipienteId() {
		return tipoRecipienteId;
	}

	public void setTipoRecipienteId(int tipoRecipienteId) {
		this.tipoRecipienteId = tipoRecipienteId;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaHoraVencimiento() {
		return fechaHoraVencimiento;
	}

	public void setFechaHoraVencimiento(Date fechaHoraVencimiento) {
		this.fechaHoraVencimiento = fechaHoraVencimiento;
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