package com.devnotebook.designpattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Observable {

    Set<Observer> observers = new HashSet<>();
    Double temperature;
    Double humidity;

    public WeatherStation(Double temperature, Double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:this.observers){
            observer.update();
        }
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
