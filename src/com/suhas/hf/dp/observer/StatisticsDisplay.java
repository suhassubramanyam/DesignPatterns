package com.suhas.hf.dp.observer;

public class StatisticsDisplay implements Observer,DisplayElement{
	private float temp;
	private float tempSum = 0.0f;
	private float minTemp = 200f;
	private float maxTemp = 0.0f;
	private int numReadings = 0;
	
	private WeatherData weatherData;
	
	
	public StatisticsDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		tempSum += temp;
		numReadings++;
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg temp: "+(tempSum/numReadings)+" Min temp: "+minTemp+" Max temp: "+maxTemp);
	}
}
