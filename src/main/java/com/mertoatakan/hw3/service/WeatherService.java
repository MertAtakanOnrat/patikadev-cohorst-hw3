package com.mertoatakan.hw3.service;

import com.mertoatakan.hw3.dto.WeatherDTO;
import com.mertoatakan.hw3.entity.Weather;
import com.mertoatakan.hw3.mapper.WeatherMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<WeatherDTO> getWeatherForecast(String city, String countryCode){
        String url = String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s,%s&mode=json&appid=%s", city, countryCode, apiKey);
        Weather response = restTemplate.getForObject(url, Weather.class);
        return WeatherMapper.mapToWeatherDTOList(response);
    }

}
