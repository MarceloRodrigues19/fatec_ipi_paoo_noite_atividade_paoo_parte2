package br.com.JM.fatec_ipi_paoo_observer;

import java.util.Random;

public class ForecastDisplay implements Observer{

	private Random gerador = new Random();

	public void update(double t, double h, double p) {
		System.out.println("Previsao do tempo");
		System.out.printf("%.2fC\n", Math.min((t-10) + gerador.nextDouble() * (t-5), 40));
		
	}
}
