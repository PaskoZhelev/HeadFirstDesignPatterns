package BObserverPattern.BWeatherStationJava;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float hummidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float hummidity, float pressure) {
        this.temperature = temperature;
        this.hummidity = hummidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHummidity() {
        return hummidity;
    }

    public float getPressure() {
        return pressure;
    }
}
