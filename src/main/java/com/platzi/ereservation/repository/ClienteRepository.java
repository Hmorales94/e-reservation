package com.platzi.ereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;

/**
 * 
 * @author Hipolito
 * Interfaz para definir las operaciones de BD relacionadas al cliente
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
