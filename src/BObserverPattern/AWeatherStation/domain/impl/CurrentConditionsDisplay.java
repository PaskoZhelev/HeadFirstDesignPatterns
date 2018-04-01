package BObserverPattern.AWeatherStation.domain.impl;

import BObserverPattern.AWeatherStation.domain.DisplayElement;
import BObserverPattern.AWeatherStation.domain.Observer;
import BObserverPattern.AWeatherStation.domain.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.1f F degrees and %.1f %s humidity", temperature, humidity, "%");
    }
}
