package com.curso.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * Clase modelo de Reserva
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@Entity
@Table(name="reservas")
public class Reserva {
	@Id
	private int idReserva;
	private String nombreCliente;
	private String dni;
	private int idHotel;
	private int idVuelo;
	
	public Reserva() {
	}

	public Reserva(int idReserva, String nombreCliente, String dni, int idHotel, int idVuelo) {
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
}
