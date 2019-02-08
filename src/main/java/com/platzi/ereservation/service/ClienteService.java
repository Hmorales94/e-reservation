package com.platzi.ereservation.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.repository.ClienteRepository;

/**
 * 
 * @author Hipolito Clase para definir los servicios del cliente
 */

@Service
@Transactional(readOnly = true)
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	};

	/**
	 * Método para realizar la operación de guardar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la opración de actualizar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Método para realizar la operación de eliminar un cliente
	 * 
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/**
	 * Método para realizar la operación de buscar un cliente
	 * 
	 * @param identificacion
	 * @return
	 */

	public Cliente findByIdentificacion(String identificacion) {
		return this.clienteRepository.findByIdentificacion(identificacion);
	}
	
	/**
	 * Método para realizar la operación de traer a todos los clientes
	 * @return
	 */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}

}
