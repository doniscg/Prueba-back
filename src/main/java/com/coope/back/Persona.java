package com.coope.back;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String correo;

	public Persona(int id, String name, String correo) {
		super();
		this.id = id;
		this.name = name;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
