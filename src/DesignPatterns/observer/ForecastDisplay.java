package DesignPatterns.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Forecast: ...");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
         this.temperature = temp;
         this.humidity = humidity;
         this.pressure = pressure;
         display();
    }
}
