package com.platzi.ereservation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 
 * @author Hipolito
 *Clase que representa la tabla reserva
 */

@Entity
@Table(name="reservacion")
@Data
public class Reservacion {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idReservacion;
	private Date fechaIngreso;
	private Date fechaSalida;
	private int cantidadPersona;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;

}
