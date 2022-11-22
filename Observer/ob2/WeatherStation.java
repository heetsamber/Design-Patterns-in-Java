package ob2;

import observer.CurrentConditionsDisplay;
import observer.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        // 실제 주체 객체에 옵저버 전달
        CurrentWeatherDisplay currentWeatherDisplay =
                new CurrentWeatherDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);


    }
}
