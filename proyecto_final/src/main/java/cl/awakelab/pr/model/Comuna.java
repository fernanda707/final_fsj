package cl.awakelab.pr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMUNA")
public class Comuna {
	@Id
	@Column(name="ID_COMUNA")
	private int id_comuna;
	@Column(name="COMUNA")
	private String comuna;
	
	public Comuna() {
		super();
	}
	
	public Comuna(int id_comuna, String comuna) {
		super();
		this.id_comuna = id_comuna;
		this.comuna = comuna;
	}
	
	public int getId_comuna() {
		return id_comuna;
	}
	public void setId_comuna(int id_comuna) {
		this.id_comuna = id_comuna;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	
}

