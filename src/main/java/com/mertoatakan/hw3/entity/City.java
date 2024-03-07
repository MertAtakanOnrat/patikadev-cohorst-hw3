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
public class City {
    @NotNull
    @JsonProperty("id")
    private int id;

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("coord")
    private Coord coord;

    @NotNull
    @JsonProperty("country")
    private String country;

    @NotNull
    @JsonProperty("population")
    private int population;

    @NotNull
    @JsonProperty("timezone")
    private int timezone;

    @NotNull
    @JsonProperty("sunrise")
    private long sunrise;

    @NotNull
    @JsonProperty("sunset")
    private long sunset;
}
