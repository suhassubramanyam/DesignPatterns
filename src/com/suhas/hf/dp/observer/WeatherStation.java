package com.suhas.hf.dp.observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currCondDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay foreDisplay = new ForecastDisplay(weatherData);
		foreDisplay.removeThisObserver(weatherData);
		
		weatherData.setMeasurements(80, 60, 30.4f);
		System.out.println();
		weatherData.setMeasurements(65, 89, 29.3f);
		System.out.println();
		weatherData.setMeasurements(76, 80, 35.4f);
		
	}
}
