package com.platzi.ereservation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.platzi.ereservation.resource.vo.ClienteVo;

import lombok.Data;
import lombok.NoArgsConstructor;

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
	
	@NoArgsConstructor
	  public static class NoArgsExample {
	  }
	
	
	public Cliente(ClienteVo clienteVo) {
		this.idCliente =  clienteVo.getIdCliente();
		this.nombre = clienteVo.getNombre();
		this.apellido = clienteVo.getApellido();
		this.identificacion = clienteVo.getIdentificacion();
		this.direccion = clienteVo.getDireccion();
		this.telefono = clienteVo.getTelefono();
		this.email = clienteVo.getEmail();
	}
	
}
