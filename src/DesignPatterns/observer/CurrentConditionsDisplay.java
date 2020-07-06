package DesignPatterns.observer;

import org.omg.CORBA.Current;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

   private float temperature;
   private float humidity;
   private float pressure;
   private Subject weatherData;

   public CurrentConditionsDisplay(Subject weatherData){
       this.weatherData = weatherData;
       weatherData.registerObserver(this);
   }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
