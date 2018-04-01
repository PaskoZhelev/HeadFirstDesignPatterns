package BObserverPattern.BWeatherStationJava;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation {

    public static void main(String[] args) {
        Observable weatherData = new WeatherData();
        Observer observer = new CurrentConditionsDisplay(weatherData);
        ((WeatherData) weatherData).setMeasurements(34.0f, 43.0f, 23.0f);
    }



}
