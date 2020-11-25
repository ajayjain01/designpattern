package com.devnotebook.designpattern;

import java.util.Objects;

public class PhoneDisplay implements Observer, Display{
    Integer id;
    WeatherStation station;

    public PhoneDisplay(Integer id, WeatherStation station) {
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
        System.out.println("Phone id:" + this.getId()+ " temp :" + this.station.getTemperature() + " humidity:" + this.station.getHumidity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneDisplay)) return false;
        PhoneDisplay that = (PhoneDisplay) o;
        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(station);
    }
}
