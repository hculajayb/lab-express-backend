package gt.edu.umg.entity;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Clientes")

public class Cliente {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int Id;

		@Column(name = "Usuario_Id", nullable = false)
		private int usuarioId;
		@Column(name = "Nombres")
		private String nombres;
		@Column(name = "Apellidos")
		private String apellidos;
		@Column(name = "Direccion")
		private String direccion;
	    @Column(name = "CUI", nullable = false)
	    private String CUI;
		@Column(name = "NIT", nullable = false)
		private String NIT;
	    @Column(name = "Telefono", nullable = false)
	    private String telefono;
	    @Column(name = "Fecha_Creacion", nullable = false)
	    private Timestamp FechaCreacion;
	    @Column(name = "Fecha_Modificacion")
	    private Timestamp FechaModificacion;
	    @Column(name = "Creado_Por", nullable = false)
	    private int CreadoPor;
	    @Column(name = "Modificado_Por")
	    private Integer ModificadoPor;
	    @Column(name = "Estado")
	    private int Estado = 1;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCUI() {
		return CUI;
	}

	public void setCUI(String CUI) {
		this.CUI = CUI;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String NIT) {
		this.NIT = NIT;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Timestamp getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaModificacion() {
		return FechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}

	public int getCreadoPor() {
		return CreadoPor;
	}

	public void setCreadoPor(int creadoPor) {
		CreadoPor = creadoPor;
	}

	public Integer getModificadoPor() {
		return ModificadoPor;
	}

	public void setModificadoPor(Integer modificadoPor) {
		ModificadoPor = modificadoPor;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}
}
