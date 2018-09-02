package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather/{location}")
    Weather weather(@PathVariable String location) {
        return new Weather(location, new Temperature(17, TemperatureUnit.CELCIUS));
    }
}
