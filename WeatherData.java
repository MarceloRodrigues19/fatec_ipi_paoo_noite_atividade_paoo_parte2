package br.com.JM.fatec_ipi_paoo_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	private Random gerador = new Random();
	private double temperature, humidity, pressure;
	
	public WeatherData() {
		observers = new LinkedList<Observer>();
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	public double getHumidity() {
		return this.humidity;
	}
	public double getPressure() {
		return this.pressure;
	}
	public void measurementsChanged() {
		notifyObservers();
		
	}
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(getTemperature(), getHumidity(), getPressure());
		}
	}
	public void setMeasurements() {
		this.temperature = 10 + gerador.nextDouble()*30;
		this.humidity= gerador.nextDouble();
		this.pressure = gerador.nextDouble()*500 + 500;
		measurementsChanged();
	}
	public void iniciar() {
		while(true) {
			setMeasurements();
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
