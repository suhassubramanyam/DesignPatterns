package com.suhas.hf.dp.observer;

public class ForecastDisplay implements Observer,DisplayElement{
	private float currPressure = 29.2f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		lastPressure = currPressure;
		currPressure = pressure;
		display();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Forecast: ");
		if (lastPressure < currPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}else if (lastPressure == currPressure) {
			System.out.println("The Weather Stays the same");
		}else {
			System.out.println("Weather is improving :)");
		}
	}
	
	public void removeThisObserver(WeatherData weatherData){
		weatherData.removeObservers(this);
	}
	
}
