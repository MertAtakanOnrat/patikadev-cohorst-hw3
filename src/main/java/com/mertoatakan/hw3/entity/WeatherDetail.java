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
public class WeatherDetail {

    @NotNull
    @JsonProperty("dt")
    private long dt;

    @NotNull
    @JsonProperty("main")
    private Main main;

    @NotNull
    @JsonProperty("weather")
    private List<WeatherInfo> weather;

    @NotNull
    @JsonProperty("clouds")
    private Clouds clouds;

    @NotNull
    @JsonProperty("wind")
    private Wind wind;

    @NotNull
    @JsonProperty("visibility")
    private int visibility;

    @NotNull
    @JsonProperty("pop")
    private int pop;

    @NotNull
    @JsonProperty("sys")
    private Sys sys;

    @NotNull
    @JsonProperty("dt_txt")
    private String dtTxt;
}
