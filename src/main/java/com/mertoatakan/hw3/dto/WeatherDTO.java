package com.mertoatakan.hw3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {
    private String temp;
    private String date;
    private String cityName;
    private String countryName;
}
