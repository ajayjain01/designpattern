package com.devnotebook.designpattern;

import java.util.Objects;

public class LEDDisplay implements Observer, Display{

    Integer id;
    WeatherStation station;

    public LEDDisplay(Integer id, WeatherStation station) {
        this.id = id;
        this.station = station;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WeatherStation getStation() {
        return station;
    }

    public void setStation(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("LED id:"+ this.getId()+ " temp :" + this.station.getTemperature() + " humidity:" + this.station.getHumidity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LEDDisplay)) return false;
        LEDDisplay that = (LEDDisplay) o;
        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(station);
    }
}
