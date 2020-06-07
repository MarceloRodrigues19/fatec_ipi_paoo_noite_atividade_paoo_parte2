package br.com.JM.fatec_ipi_paoo_observer;

import java.text.NumberFormat;

public class CurrentConditionDisplay implements Observer {
	private NumberFormat percentFormat = NumberFormat.getPercentInstance();
	
	public void update(double t, double h, double p) {
		System.out.println("Condicoes atuais");
		System.out.printf("Temp: %.2f, Hum : %s, Pres: %.2f\n", t, percentFormat.format(h), p);
	}
}
