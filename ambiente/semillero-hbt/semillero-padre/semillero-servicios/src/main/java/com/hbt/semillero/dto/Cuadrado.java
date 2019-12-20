package com.hbt.semillero.dto;

import com.hbt.semillero.interfaces.InterfaceEjemploLocal;

public class Cuadrado implements InterfaceEjemploLocal {

	private double lado;
	


	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getLado()*getLado());
	}

}
