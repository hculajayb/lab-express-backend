package gt.edu.umg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombres")
    private String nombre;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Contrasenia")
    private String contrasenia;
    @Column(name = "Creado_Por")
    private Integer creado_por;
}
