package com.mertoatakan.hw3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    @NotNull
    @JsonProperty("cod")
    private String cod;

    @NotNull
    @JsonProperty("message")
    private int message;

    @NotNull
    @JsonProperty("cnt")
    private int cnt;

    @NotNull
    @JsonProperty("list")
    private List<WeatherDetail> list;

    @NotNull
    @JsonProperty("city")
    private City city;
}