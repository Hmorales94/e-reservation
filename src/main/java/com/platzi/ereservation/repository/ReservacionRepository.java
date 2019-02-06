package com.platzi.ereservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.model.Reservacion;

/**
 * 
 * @author Hipolito
 * Interfaz para definir las operaciones de BD relacionadas a la reservacion
 */
public interface ReservacionRepository extends JpaRepository<Reservacion, String>{
	
	@Query("SELECT r from Reservacion r WHERE r.fechaIngreso = :fechaIngreso AND fechaSalida = :fechaSalida ")
	public List<Reservacion> find(@Param("fechaIngreso") Date fechaIngreso, @Param("fechaSalida") Date fechaSalida);

}
