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
public class Wind {

    @NotNull
    @JsonProperty("speed")
    private double speed;

    @NotNull
    @JsonProperty("deg")
    private int deg;

    @NotNull
    @JsonProperty("gust")
    private double gust;
}