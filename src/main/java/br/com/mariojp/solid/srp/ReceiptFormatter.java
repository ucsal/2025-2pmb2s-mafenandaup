package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

	// Responsável por formatar o recibo
		public String FormatReceipt(double subtotal, double tax, double total) {

			StringBuilder sb = new StringBuilder(); //Formatando o Recibo
			sb.append("Subtotal: ").append(subtotal).append("\n");
			sb.append("Tax: ").append(tax).append("\n");
			sb.append("Total: ").append(total).append("\n");
			return sb.toString();
	}
}
