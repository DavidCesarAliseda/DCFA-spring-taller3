package com.nttdata.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * Esta clase define el objeto NTTDataClient el cual representa un cliente.
 * @author David C�sar Fern�ndez Aliseda
 * @version 01/12/21/A
 */

@Entity
@Table(name = "NTTDATA_CLIENTE")
public class NTTDataClient implements Serializable{
	
	private Long id;
	private String name;
	private String surname1;
	private String surname2;
	private Date birthDate;
	private String dni;
	
	/**
     * Constructor para NTTDataClient
     */
	
	public NTTDataClient() {
		super();
	}

	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Name
	@Column(name = "CLIENT_NAME", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Surname1
	@Column(name = "CLIENT_SURNAME1", nullable = false)
	public String getSurname1() {
		return surname1;
	}
	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}
	
	//Surname2
	@Column(name = "CLIENT_SURNAME2", nullable = false)
	public String getSurname2() {
		return surname2;
	}
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	
	//DNI
	@Column(name = "CLIENT_DNI", unique=true ,nullable = false, length=9)
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//birthDate
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	/**
     * M�todo para construir una cadena con el los atributos del objeto.
     */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2 + ", dni="
				+ dni + "]";
	}
	
	@Transient
	public Class<?> getClase() {
		return NTTDataClient.class;
	}
	
}
