package com.platzi.ereservation.service;

import org.springframework.stereotype.Service;

import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.repository.ClienteRepository;

/**
 * 
 * @author Hipolito
 * Clase para definir los servicios del cliente
 */

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}; 
	
	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 */
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la opración de actualizar un cliente
	 * @param cliente
	 * @return
	 */
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de eliminar un cliente
	 * @param cliente
	 */
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para realizar la operación de de buscar un cliente 
	 * @param identificacion
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacion) {
		return this.clienteRepository.findByIdentificacion(identificacion);
	}

}
