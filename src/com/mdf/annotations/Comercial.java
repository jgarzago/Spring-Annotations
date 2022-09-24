package com.mdf.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Comercial implements iEmpleado {
	
	@Autowired
	private iCreacionInforme nuevoInforme;

	/*@Autowired
	public Comercial(iCreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*@Autowired
	public void setNuevoInforme(iCreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.nuevoInforme.getInformeFinanciero();
	}


}
