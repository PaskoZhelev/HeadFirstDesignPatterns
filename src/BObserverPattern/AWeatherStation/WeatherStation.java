package BObserverPattern.AWeatherStation;

import BObserverPattern.AWeatherStation.domain.impl.CurrentConditionsDisplay;
import BObserverPattern.AWeatherStation.domain.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(30.5f, 14.2f, 20.0f);

    }
}
