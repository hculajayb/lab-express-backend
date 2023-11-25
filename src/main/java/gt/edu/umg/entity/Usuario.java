package gt.edu.umg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "Usuarios")
public class Usuario {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
		@Column(name = "Rol_Id")
		private int rolId;
		@Column(name = "Tipo_Usuario")
	    private String tipoUsuario;
		@Column(name = "Correo")
	    private String correo;
		@Column(name = "Contrasenia")
	    private String contrasenia;

	    @Column(name = "Fecha_Creacion")
	    private Timestamp fechaCreacion;

	    @Column(name = "Fecha_Modificacion")
	    private Timestamp fechaModificacion;

	    @Column(name = "Creado_Por")
	    private int creadoPor;

	    @Column(name = "Modificado_Por")
	    private Integer modificadoPor;

	    private int estado = 1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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
