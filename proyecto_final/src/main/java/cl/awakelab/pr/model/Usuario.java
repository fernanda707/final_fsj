package cl.awakelab.pr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Usuario {
	@Id	
	@Column(name="ID_USER")
	private int id_usuario;
	@Column(name="USERNAME")
	private String username;
	@JoinColumn(name="CLIENTE_ID_CLIENTE")
	@ManyToOne
	private Cliente cliente;
	
	public Usuario() {
		super();
		
	}

	public String getUsername() {
		return username;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	
}
