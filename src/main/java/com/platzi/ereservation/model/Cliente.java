package com.platzi.ereservation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author Hipolito
 * Clase que representa la tabla Cliente
 */

@Entity
@Table(name = "cliente")
@Data
@NamedQuery(name="Cliente.findByIdentificacion", query="SELECT c FROM Cliente c WHERE c.identificacion = ?1")
public class Cliente {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCliente;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String direccion;
	private String telefono;
	private String email;
	
	@OneToMany(mappedBy="cliente")
	private Set<Reservacion> reservaciones;
	
}
