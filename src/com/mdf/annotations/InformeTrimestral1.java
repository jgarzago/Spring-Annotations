package com.mdf.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestral1 implements iCreacionInforme{

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero trimestre 1";
	}
	

}
