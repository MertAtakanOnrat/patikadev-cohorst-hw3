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
public class WeatherInfo {

    @NotNull
    @JsonProperty("id")
    private int id;

    @NotNull
    @JsonProperty("main")
    private String main;

    @NotNull
    @JsonProperty("description")
    private String description;

    @NotNull
    @JsonProperty("icon")
    private String icon;
}
