package com.webage.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(TaxConfig.class)) {

			Register register = context.getBean("registerBean", Register.class);

			double total = register.computeTotal(18.45);
			System.out.println("Total tax: " + total);
		}

	}

}
