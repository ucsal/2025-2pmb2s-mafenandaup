package br.com.mariojp.solid.srp;
import br.com.mariojp.solid.srp.ReceiptFormatter;
import br.com.mariojp.solid.srp.TaxCalculator;

public class ReceiptService  {
	
	  private final TaxCalculator taxCalculator; //injeções internas de cada classe
	    private final ReceiptFormatter formatter; // baixo acoplamento - receiptService apenas usa as dependências, mas não sabe como são feitas.
	    
	    // não instanciamos via objeto - como new TaxCalculator() - porque aumenta a dependência das classes concretas.
	    // Mantém o SRP dessa forma.

	    public ReceiptService(TaxCalculator taxCalculator, ReceiptFormatter formatter) { // construtor com as instâncias de duas classes
	        this.taxCalculator = taxCalculator;
	        this.formatter = formatter;
	    }
	
	// calcula apenas o subtotal
	public double CalculateSubtotal(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		return subtotal;
	}
	
	// calcula as taxas 
	public double TaxCalculator(double subtotal) {
		double tax = taxCalculator.calculateTax(subtotal);
		return tax;
	}
	
	//gera o recibo 
	public String GenerateReciept(Order order) {
		 double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		 double tax = taxCalculator.calculateTax(subtotal);
		 double total = subtotal + tax;
		 
	    return formatter.FormatReceipt(subtotal, tax, total);
	}
	
	
}
