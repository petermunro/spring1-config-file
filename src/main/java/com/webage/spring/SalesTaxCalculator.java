package com.webage.spring;

public class SalesTaxCalculator implements TaxCalculator {

	private double taxRate = 0.05;
	
	public double calculateTax(double amount) {
		return amount * taxRate;
	}

}

