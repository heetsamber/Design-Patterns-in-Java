package observer;

import observer.Observer;
import observer.WeatherData;

// 옵저버를 실제촤한 객체 주체를 구독해서 정보를 받아옴
// 실제 표시할 화면.
public class CurrentWeatherDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentWeatherDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    // 발생 시킬 이벤트
    @Override
    public void display() {
      System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    // 데이터 전달후 이벤트 실행
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity    = weatherData.getHumidity();
        display();
    }
}
