package cl.awakelab.pr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERSONA")
public class Persona {
	@Id
	//@Column(name="ID_PERSONA")
	@SequenceGenerator(name="seq",sequenceName="SEQ_PERSONA")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id_persona;
	@Column(name="RUT")
	private String rut;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO_PATERNO")
	private String ap_paterno;
	@Column(name="APELLIDO_MATERNO")
	private String ap_materno;
	@Column(name="EDAD")
	private int edad;
	@Column(name="ES_PROFESIONAL")
	private char es_profesional;
	
	public Persona() {
		super();
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_paterno() {
		return ap_paterno;
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getEs_profesional() {
		return es_profesional;
	}
	public void setEs_profesional(char es_profesional) {
		this.es_profesional = es_profesional;
	}
	
	
}
