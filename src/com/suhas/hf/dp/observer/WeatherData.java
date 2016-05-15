package com.suhas.hf.dp.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private float temp;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	
	@Override
	public void removeObservers(Observer o) {
		// TODO Auto-generated method stub
		boolean result = observers.remove(o);
		if (result) {
			System.out.println("Removed observer");
		} else {
			System.out.println("Couldn't remove observer");
		}
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
