package cl.awakelab.pr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	@Id
	//@Column(name="ID_CLIENTE")seq_cliente
	@SequenceGenerator(name="seq",sequenceName="SEQ_CLIENTE")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id_cliente;
	@Column(name="RAZON_SOCIAL")
	private String razon_social;
	@Column(name="RUT")
	private String rut;
	@Column(name="RUBRO")
	private String rubro;
	@Column(name="DIRECCION")
	private String direccion;
	@Column(name="NUM_COLABORADORES")
	private int num_colaboradores;	
	
	@JoinColumn(name="COMUNA_ID_COMUNA")
	@ManyToOne
	private Comuna comuna;
	
	public Cliente(int id_cliente, String razon_social, String rut, String rubro, String direccion,
			int num_colaboradores, Comuna comuna) {
		super();
		this.id_cliente = id_cliente;
		this.razon_social = razon_social;
		this.rut = rut;
		this.rubro = rubro;
		this.direccion = direccion;
		this.num_colaboradores = num_colaboradores;
		this.comuna = comuna;
	}
	
	public Cliente() {
		super();
		
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNum_colaboradores() {
		return num_colaboradores;
	}

	public void setNum_colaboradores(int num_colaboradores) {
		this.num_colaboradores = num_colaboradores;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	
	

}
