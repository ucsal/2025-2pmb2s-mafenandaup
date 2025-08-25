package br.com.mariojp.solid.srp;

public class TaxCalculator {

	private final double taxRate;
	
	  public TaxCalculator() {
	        String rateProperty = System.getProperty("tax.rate", "0.10"); // o System.getProperty é um mecanismo de chave-valor armazenado na JVM.
	        // a diferença dele pro Map.For usado no primeiro exercício é que esse valor é o valor padrão caso outro 
	        //não seja definido via execução ou testes do projeto. 
	        this.taxRate = Double.parseDouble(rateProperty); // transforma o valor referente à chave string - tax.rate - em double.
	        // por padrão, é uma taxa de 10%
	    }

	    public double calculateTax(double subtotal) {
	        return subtotal * taxRate; // aqui calcula a taxa usando o subtotal da conta e o valor da taxa definido antes
	    }
}
