package com.hbt.semillero.dto;

import com.hbt.semillero.interfaces.InterfaceEjemploLocal;

public class Circulo extends Figura  implements InterfaceEjemploLocal {

	private double radio;
	
	
	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.PI*(getRadio()*getRadio()));
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI*(getRadio()*getRadio()));
	}

}
