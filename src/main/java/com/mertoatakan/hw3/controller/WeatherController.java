package com.mertoatakan.hw3.controller;

import com.mertoatakan.hw3.dto.WeatherDTO;
import com.mertoatakan.hw3.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/weather")
@Validated
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping()
    public ResponseEntity<List<WeatherDTO>> getWeatherForecast(@RequestParam String city, @RequestParam String country){
        List<WeatherDTO> weatherForecast = weatherService.getWeatherForecast(city, country);
        return ResponseEntity.ok(weatherForecast);
    }
}
