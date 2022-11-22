package ob2;

import java.util.ArrayList;
import java.util.List;

// 실제 주체 객체 실제 데이터를 관리함
public class WeatherData implements Subject{
    // 옵저버들을 저장할 리스트
    private List<Observer> observers;
    // 실제 데이터
    private float temperature;
    private float humidity;
    private float pressure;
    // 생성될때 옵저버를 담을 리스트를 초기화함
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            //실제 데이터를 전달해서 update함
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        // 실제 데이터 저장
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //데이터가 업데이트되면 새로 반영한 정보를 통보해서 호출함
        measurementsChanged();
    }

    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }
}
