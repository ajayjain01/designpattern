package com.devnotebook.designpattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ObserverTest {

    private  WeatherStation weatherStation;

    @Before
    public void before(){
        System.out.println("before");
        this.weatherStation = new WeatherStation(100.0,34.2);

        PhoneDisplay phoneDisplay = new PhoneDisplay(1,weatherStation);
        this.weatherStation.add(phoneDisplay);

        PhoneDisplay phoneDisplay2 = new PhoneDisplay(2,weatherStation);
        this.weatherStation.add(phoneDisplay2);

        LEDDisplay ledDisplay = new LEDDisplay(1,weatherStation);
        this.weatherStation.add(ledDisplay);

        LEDDisplay ledDisplay2 = new LEDDisplay(2,weatherStation);
        this.weatherStation.add(ledDisplay2);

        System.out.println(weatherStation);
    }

    @Test
    public void testHumidtyChange(){
        weatherStation.setHumidity(35.3);
    }

    @Test
    public void testTemperatureChange(){
        weatherStation.setTemperature(98.2);
    }

    @After
    public void after(){
        System.out.println("after");
    }
}
