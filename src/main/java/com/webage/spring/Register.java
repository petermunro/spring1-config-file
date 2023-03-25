package com.webage.spring;

public class Register {
	private TaxCalculator taxCalc;
	
	public Register(TaxCalculator taxCalc) {
		super();
		this.taxCalc = taxCalc;
	}

	public double computeTotal(double beforeTax) {
		return beforeTax + taxCalc.calculateTax(beforeTax);
	}

}
