package br.com.JM.fatec_ipi_paoo_observer;

public class StatsDisplay implements Observer{
	private double historicoTemps;
	private int qtTemps;
	public void update(double t, double h, double p) {
		historicoTemps += t;
		qtTemps += 1;
		System.out.println("Media historica:");
		System.out.printf("%.2f\n", (historicoTemps/ qtTemps));
	}
}
