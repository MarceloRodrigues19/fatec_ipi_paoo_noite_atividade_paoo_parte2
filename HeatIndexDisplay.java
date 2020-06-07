package br.com.JM.fatec_ipi_paoo_observer;

public class HeatIndexDisplay implements Observer {
	
    final double C1 = -42.379;
    final double C2 = 2.04901523;
    final double C3 = 10.14333127;
    final double C4 = -0.22475541;
    final double C5 = -.00683783;
    final double C6 = -5.481717E-2;
    final double C7 = 1.22874E-3;
    final double C8 = 8.5282E-4;
    final double C9 = -1.99E-6;
    
	@Override
	public void update(double t, double h, double p) {
		// TODO Auto-generated method stub
	    double temp = t * t;
	    double hum = h * h;	
	    double indice = C1 + (C2 * t) + (C3 * h) + (C4 * t * h) + (C5 * temp) + (C6 * hum) + (C7 * temp * h) + (C8 * t *hum) + (C9 * temp * hum);
	    
	    System.out.println("Indice de calor:");
	    System.out.printf("Indice: %.2f\n", indice);
	    System.out.println();
	}
}
