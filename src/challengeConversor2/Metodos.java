package challengeConversor2;

import java.text.DecimalFormat;

public class Metodos {

	public static String Currencies(int divisaSalida, int divisaDestino, double monto) {
		// De acuerdo a la divisa de ingreso o "Salida" entra al switch correspondiente y resuelve el segundo switch según
		// la divisa de "Destino" se desea recibir.
		//"Peso Argentino", "Dólar", "Euro", "Libra Esterlina", "Won", "Yen"
		//         1           2        3            4            5      6
		double saldo = monto;
		String saldoFinal = "0";
		switch (divisaSalida) {
		case 1: // PESO ARGENTINO
			switch (divisaDestino) {
			case 1:
				break;
			case 2:
				saldo = monto/208.22;
				break;
			case 3:
				saldo = monto/225.78;
				break;
			case 4:
				saldo = monto/256.61;
				break;
			case 5:
				saldo = monto*6.27;
				break;
			case 6:
				saldo = monto/1.57;
				break;
			}
			break;
		case 2: // DOLLAR
			switch (divisaDestino) {
			case 1:
				saldo = monto*208.22;
				break;
			case 2:
				break;
			case 3:
				saldo = monto*0.92;
				break;
			case 4:
				saldo = monto*0.81;
				break;
			case 5:
				saldo = monto*1306.75;
				break;
			case 6:
				saldo = monto*132.74;
				break;
			}
			break;
		case 3: // EURO
			switch (divisaDestino) {
			case 1:
				saldo = monto*225.85;
				break;
			case 2:
				saldo = monto/0.92;
				break;
			case 3:
				break;
			case 4:
				saldo = monto*0.88;
				break;
			case 5:
				saldo = monto*1416.90;
				break;
			case 6:
				saldo = monto*143.94;
				break;
			}
			break;
		case 4:
			switch (divisaDestino) {
			case 1:
				saldo = monto*256.61;
				break;
			case 2:
				saldo = monto/0.81;
				break;
			case 3:
				saldo = monto/0.88;
				break;
			case 4:
				break;
			case 5:
				saldo = monto*1609.27;
				break;
			case 6:
				saldo = monto*163.46;
				break;
			}
			break;
		case 5: // WON
			switch (divisaDestino) {
			case 1:
				saldo = monto*0.16;
				break;
			case 2:
				saldo = monto/1305.72;
				break;
			case 3:
				saldo = monto/1416.9;
				break;
			case 4:
				saldo = monto/1609.27;
				break;
			case 5:
				break;
			case 6:
				saldo = monto/9.84;
				break;
			}
			break;
		case 6:
			switch (divisaDestino) {
			case 1:
				saldo = monto*1.57;
				break;
			case 2:
				saldo = monto/132.77;
				break;
			case 3:
				saldo = monto/143.96;
				break;
			case 4:
				saldo = monto/163.48;
				break;
			case 5:
				saldo = monto*9.84;
				break;
			case 6:
				break;
			}
			break;
		}
		switch (divisaDestino) { // De acuerdo a la divisa dinal deseada se determina el formato
		case 1:
			saldoFinal = new DecimalFormat("ARS #,##0.00").format(saldo);
			break;
		case 2:
			saldoFinal = new DecimalFormat("USD #0.00").format(saldo);
			break;
		case 3:
			saldoFinal = new DecimalFormat("EUR #0.00").format(saldo);
			break;
		case 4:
			saldoFinal = new DecimalFormat("GBP #,##0.00").format(saldo);
			break;
		case 5:
			saldoFinal = new DecimalFormat("KRW #0.00").format(saldo);
			break;
		case 6:
			saldoFinal = new DecimalFormat("JPY #0.00").format(saldo);
			break;
		}
				return saldoFinal;		
	}
	
	public static String Temperatures(String ent, String sal, double valor) {
		// Según la temperatura de "entrada" ingresada ingresa al primer switch y según la de "salida" deseada
		// ingresa y realiza la operación correspondiente.
		String tempFinal = "0.0";
		double newtemp = valor;
		switch (ent) {
		case "Celsius":
			switch (sal) {
			case "Celsius":
				break;
			case "Fahrenheit":
				newtemp = 9*valor/5 + 32;
				break;
			case "Kelvin":
				newtemp = valor + 273.15;
				break;
			}
			break;
		case "Fahrenheit":
			switch (sal) {
			case "Celsius":
				newtemp = 5*valor/9 - 32;
				break;
			case "Fahrenheit":
				break;
			case "Kelvin":
				newtemp = (5*valor/9 - 32) + 273.15;
				break;				
			}
			break;
			
		case "Kelvin":
			switch (sal) {
			case "Celsius":
				newtemp = valor - 273.15;
				break;
			case "Fahrenheit":
				newtemp = 9*(valor - 273.15)/5 + 32;
				break;
			case "Kelvin":
				break;
			}
			break;
		}
		switch (sal) { // De acuerdo a la moneda de salida deseada se determina el formato
		case "Celsius":
			tempFinal = new DecimalFormat("#0.00 °C").format(newtemp);
			break;
		case "Fahrenheit":
			tempFinal = new DecimalFormat("#0.00 °F").format(newtemp);
			break;
		case "Kelvin":
			tempFinal = new DecimalFormat("#0.00 K").format(newtemp);
			break;
	}
		return tempFinal;
}
}
