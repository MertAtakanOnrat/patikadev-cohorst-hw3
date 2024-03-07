package com.mertoatakan.hw3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Main {
    @NotNull
    @JsonProperty("temp")
    private double temp;

    @NotNull
    @JsonProperty("feels_like")
    private double feelsLike;

    @NotNull
    @JsonProperty("temp_min")
    private double tempMin;

    @NotNull
    @JsonProperty("temp_max")
    private double tempMax;

    @NotNull
    @JsonProperty("pressure")
    private int pressure;

    @NotNull
    @JsonProperty("sea_level")
    private int seaLevel;

    @NotNull
    @JsonProperty("grnd_level")
    private int grndLevel;

    @NotNull
    @JsonProperty("humidity")
    private int humidity;

    @NotNull
    @JsonProperty("temp_kf")
    private double tempKf;
}
