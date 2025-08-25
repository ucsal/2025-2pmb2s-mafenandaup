package br.com.mariojp.solid.srp;

public class TaxCalculator {

	private final double taxRate;
	
	public double CalculateTax(double taxRate) {
		if (taxRate == null) {
			this.taxRate = 0.10;
		}
		this.taxRate = taxRate;
		
	}
}
