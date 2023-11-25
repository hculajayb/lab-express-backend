package gt.edu.umg.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Solicitudes")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Cliente_Id", nullable = false)
    private int clienteId;

    @Column(name = "Estado_Solicitud_Id", nullable = false)
    private int estadoSolicitudId;

    @Column(name = "Numero_Soporte", nullable = false)
    private String numeroSoporte;

    @Column(name = "Codigo_Solicitud", nullable = false)
    private String codigoSolicitud;

    @Column(name = "Descripcion", nullable = false, length = 2000)
    private String descripcion;

    @Column(name = "No_Factura", nullable = false)
    private String noFactura;

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

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getEstadoSolicitudId() {
		return estadoSolicitudId;
	}

	public void setEstadoSolicitudId(int estadoSolicitudId) {
		this.estadoSolicitudId = estadoSolicitudId;
	}

	public String getNumeroSoporte() {
		return numeroSoporte;
	}

	public void setNumeroSoporte(String numeroSoporte) {
		this.numeroSoporte = numeroSoporte;
	}

	public String getCodigoSolicitud() {
		return codigoSolicitud;
	}

	public void setCodigoSolicitud(String codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNoFactura() {
		return noFactura;
	}

	public void setNoFactura(String noFactura) {
		this.noFactura = noFactura;
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