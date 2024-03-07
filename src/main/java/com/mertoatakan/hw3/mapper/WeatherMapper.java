package com.mertoatakan.hw3.mapper;

import com.mertoatakan.hw3.dto.WeatherDTO;
import com.mertoatakan.hw3.entity.Weather;
import com.mertoatakan.hw3.entity.WeatherDetail;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WeatherMapper {

    public static List<WeatherDTO> mapToWeatherDTOList(Weather weather) {
        List<WeatherDTO> weatherDTOList = new ArrayList<>();
        for (WeatherDetail weatherDetail : weather.getList()) {
            if (isNoon(weatherDetail.getDtTxt())) {
                WeatherDTO weatherDTO = new WeatherDTO();
                double tempInCelsius = kelvinToCelsius(weatherDetail.getMain().getTemp());
                tempInCelsius = Math.round(tempInCelsius * 100.0) / 100.0;
                String formattedTemp = String.format("%.2f°C", tempInCelsius);
                weatherDTO.setTemp(formattedTemp);
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE", new Locale("tr"));
                LocalDate localDate = LocalDate.parse(weatherDetail.getDtTxt().substring(0, 10));
                String formattedDate = localDate.format(dateFormatter);
                weatherDTO.setDate(formattedDate);
                weatherDTO.setCityName(weather.getCity().getName());
                weatherDTO.setCountryName(weather.getCity().getCountry());
                weatherDTOList.add(weatherDTO);
            }
        }
        return weatherDTOList;
    }

    private static boolean isNoon(String dateTimeString) {
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString.replace(" ", "T"));
        return dateTime.getHour() == 12;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
