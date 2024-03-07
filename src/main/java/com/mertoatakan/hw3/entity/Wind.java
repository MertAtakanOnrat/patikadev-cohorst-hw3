package com.mertoatakan.hw3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wind {
    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private int deg;

    @JsonProperty("gust")
    private double gust;
}