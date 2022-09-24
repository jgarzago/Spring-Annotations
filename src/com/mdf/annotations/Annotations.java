package com.mdf.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		
		iEmpleado comercial = ctx.getBean("comercial",iEmpleado.class);
		
		System.out.println(comercial.getTareas());
		System.out.println(comercial.getInforme());
		
		ctx.close();
	}

}
