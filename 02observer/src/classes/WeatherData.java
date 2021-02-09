package classes;

import java.util.ArrayList;
import java.util.Iterator;

import interfaces.Observer;
import interfaces.Subject;

public class WeatherData implements Subject {
	// properties
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		this.observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	// Notify Observers when update measurements changed
	public void measurementsChanged() {
		notifyObserver();
	}
	
	// For test purpose only
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
