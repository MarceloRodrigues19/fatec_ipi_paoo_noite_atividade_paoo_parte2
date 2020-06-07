package br.com.fatec_ipi_paoo_observer;

import java.util.LinkedList;

public class HistoryDisplay implements Observer {
	
	private LinkedList<Double> temps;
	
	public HistoryDisplay() {
		temps = new LinkedList<Double>();
	}
	
	public void update(double t, double h, double p) {
		
		if(temps.size()>=10) {
			temps.remove(0);
		}
		temps.add(t);
		
		
		if (temps.size() == 10) {
			System.out.println("Historico - ultimas 10 temperaturas:");
			for (Double d : temps) {
				System.out.printf("%.2f\n", d);
			}			
		}
	}
}