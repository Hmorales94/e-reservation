package com.platzi.ereservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;

/**
 * 
 * @author Hipolito
 * Interfaz para definir las operaciones de BD relacionadas al cliente
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @param apellido
	 * @return
	 */
	
	public List<Cliente> findByApellido(String apellido);
	
	public Cliente findByIdentificacion(String identificacion);
	
}
