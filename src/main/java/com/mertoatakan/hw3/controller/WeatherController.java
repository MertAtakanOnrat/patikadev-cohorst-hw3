package com.mertoatakan.hw3.controller;

import com.mertoatakan.hw3.dto.WeatherDTO;
import com.mertoatakan.hw3.general.RestResponse;
import com.mertoatakan.hw3.service.WeatherService;
import jakarta.validation.constraints.NotBlank;
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
    public ResponseEntity<RestResponse<List<WeatherDTO>>> getWeatherForecast(@RequestParam @NotBlank String city, @RequestParam @NotBlank String country){
        List<WeatherDTO> weatherForecast = weatherService.getWeatherForecast(city, country);
        return ResponseEntity.ok(RestResponse.of(weatherForecast));
    }
}
