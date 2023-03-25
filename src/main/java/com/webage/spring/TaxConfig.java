package com.webage.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaxConfig {

	@Bean
	public TaxCalculator getTaxCalculator() {
		System.out.println("getTaxCalculator()");
		return new SalesTaxCalculator();
	}
	
    @Bean
    public Register registerBean(SalesTaxCalculator taxCalculator) {
    	System.out.println("registerBean(" + taxCalculator + ")");
    	return new Register(taxCalculator);
    }
	
}

