package com.platzi.ereservation.resource.vo;
import lombok.Data;

/**
 * @author Hipolito
 * Clase que representa la tabla Cliente
 */

@Data
public class ClienteVo {
	
	private String idCliente;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String direccion;
	private String telefono;
	private String email;
	
	
	
}
