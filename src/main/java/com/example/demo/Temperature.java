package com.example.demo;

import lombok.Value;

@Value
public class Temperature {
    int degrees;
    TemperatureUnit unit;
}
