package br.com.JM.fatec_ipi_paoo_observer;

public class TestStationMonitoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData estacaoMonitoramento = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay();
		StatsDisplay sd = new StatsDisplay();
		ForecastDisplay fd = new ForecastDisplay();
		HeatIndexDisplay hdi = new HeatIndexDisplay();
		MediaHistoryDisplay mh = new MediaHistoryDisplay();
		HistoryDisplay hd = new HistoryDisplay();
		
		estacaoMonitoramento.addObserver(ccd);
		estacaoMonitoramento.addObserver(sd);
		estacaoMonitoramento.addObserver(fd);
		estacaoMonitoramento.addObserver(hdi);
		estacaoMonitoramento.addObserver(mh);
		estacaoMonitoramento.addObserver(hd);
		
		estacaoMonitoramento.iniciar();
	}

}
