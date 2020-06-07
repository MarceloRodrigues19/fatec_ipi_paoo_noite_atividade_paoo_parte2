package br.com.JM.fatec_ipi_paoo_observer;

import java.util.LinkedList;

public class MediaHistoryDisplay implements Observer {
	
	private LinkedList<Double> temps;
	
	public MediaHistoryDisplay() {
		temps = new LinkedList<Double>();
	}
	
	private double somaTemp = 0;
	public void update(double t, double h, double p) {
		
		if(temps.size()>=10) {
			temps.remove(0);
		}
		temps.add(t);
		
		if (temps.size() == 10) {
			for (Double d : temps) {
				somaTemp += d;
			}
			
			System.out.println("Media histórica - das ultimas 10 temperaturas:");
			System.out.printf("%.2f\n", (somaTemp/10));
		}
	}
}