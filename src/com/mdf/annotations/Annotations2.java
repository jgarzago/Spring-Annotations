package com.mdf.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		iEmpleado Antonio = ctx.getBean("comercial", iEmpleado.class);
		
				System.out.println(Antonio.getInforme());
				System.out.println(Antonio.getTareas());
		
		ctx.close();
		
	}

}
