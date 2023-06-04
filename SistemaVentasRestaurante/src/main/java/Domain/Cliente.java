package Domain;
import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Clientes")
@Data
public class Cliente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name  = "nombre")
	private String nombre;
	@Column (name = "apellido")
	private String apellido;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column (name = "direccion")
	private String direccion;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "correo")
	private String correo;
	}
