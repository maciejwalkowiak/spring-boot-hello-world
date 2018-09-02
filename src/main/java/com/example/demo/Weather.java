package com.example.demo;

import lombok.Value;

@Value
public class Weather {
    String location;
    Temperature temperature;
}
