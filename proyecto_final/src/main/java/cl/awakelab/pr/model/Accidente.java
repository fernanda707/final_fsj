package cl.awakelab.pr.model;

import java.sql.Date;

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
@Table(name="ACCIDENTE")
public class Accidente {
	@Id
	@SequenceGenerator(name="seq",sequenceName="SEQ_ACCIDENTE")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id_accidente;
	
	@JoinColumn(name="PERSONA_ID_PERSONA")
	@ManyToOne
	private Persona persona;
	
	@Column(name="FECHA_ACCIDENTE")
	private Date fecha_accidente;
	
	@Column(name="LABOR_DESARROLLADA")
	private String labor_desarrollada;
	
	@JoinColumn(name="CLIENTE_ID_CLIENTE")
	@ManyToOne
	private Cliente cliente;

	public Accidente() {
		super();
	}

	public int getId_accidente() {
		return id_accidente;
	}

	public void setId_accidente(int id_accidente) {
		this.id_accidente = id_accidente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getFecha_accidente() {
		return fecha_accidente;
	}

	public void setFecha_accidente(Date fecha_accidente) {
		this.fecha_accidente = fecha_accidente;
	}

	public String getLabor_desarrollada() {
		return labor_desarrollada;
	}

	public void setLabor_desarrollada(String labor_desarrollada) {
		this.labor_desarrollada = labor_desarrollada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
