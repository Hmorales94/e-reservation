package com.platzi.ereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Reservacion;

/**
 * 
 * @author Hipolito
 * Interfaz para definir las operaciones de BD relacionadas a la reservacion
 */
public interface ReservacionRepository extends JpaRepository<Reservacion, String>{

}
