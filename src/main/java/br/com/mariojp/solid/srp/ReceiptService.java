package br.com.mariojp.solid.srp;
import br.com.mariojp.solid.srp.ReceiptFormatter;
import br.com.mariojp.solid.srp.TaxCalculator;

public class ReceiptService  {
	
	  private final TaxCalculator taxCalculator;
	    private final ReceiptFormatter formatter;
	    
	    // não instancia via objeto - como new TaxCalculator() - porque aumenta a dependência das classes concretas.
	    // 

	    public ReceiptService(TaxCalculator taxCalculator, ReceiptFormatter formatter) { // construtor com as instâncias de duas classes
	        this.taxCalculator = taxCalculator;
	        this.formatter = formatter;
	    }
	
	// calcula apenas o subtotal
	public double CalculateSubtotal(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		return subtotal;
	}
	
	public double TaxCalculator(double subtotal) {
		double tax = taxCalculator.CalculateTax(subtotal);
		return tax;
	}
	
	public String GenerateReciept(List<Double> items) {
		double tax = //instancia o objeto tax e o método pra calcular
		 double subtotal = items.stream().mapToDouble(Double::doubleValue).sum();
		 double total = subtotal + tax;
	}
	
}
