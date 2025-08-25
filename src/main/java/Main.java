import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {
		
		TaxCalculator taxCalculator = new TaxCalculator(); //aqui podem ser instanciados como objetos 
	    ReceiptFormatter formatter = new ReceiptFormatter();
	    ReceiptService service = new ReceiptService(taxCalculator, formatter); // para serem parâmetros de injeção no ReceiptService

		Order o = new Order();
		o.add(new Item("Café", 8.0, 2)); // 16
		o.add(new Item("Bolo", 12.5, 1)); // 12.5 -> subtotal 28.5
		String receipt = new ReceiptService(taxCalculator, formatter).GenerateReciept(o);
		System.out.println(receipt);
		
	}
}
