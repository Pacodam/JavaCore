package DesignPatterns.observer;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("AVG/MAX/MIN temperature...");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
           this.temperature = temp;
           this.humidity = humidity;
           this.pressure = pressure;
           display();
    }
}
