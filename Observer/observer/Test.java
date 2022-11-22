package observer;

public class Test {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        CurrentConditionsDisplay current1 = new CurrentConditionsDisplay(weather, 1);
        CurrentConditionsDisplay current2 = new CurrentConditionsDisplay(weather, 2);
        CurrentConditionsDisplay current3 = new CurrentConditionsDisplay(weather, 3);

        weather.setMeasurements(30,65, 30.4f);
        weather.setMeasurements(29,64, 30.5f);
        weather.setMeasurements(30,64, 30.6f);
    }
}
