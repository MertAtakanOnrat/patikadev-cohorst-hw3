package com.mertoatakan.hw3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDetail {
    @JsonProperty("dt")
    private long dt;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("weather")
    private List<WeatherInfo> weather;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("visibility")
    private int visibility;

    @JsonProperty("pop")
    private int pop;

    @JsonProperty("sys")
    private Sys sys;

    @JsonProperty("dt_txt")
    private String dtTxt;
}
