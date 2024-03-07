package com.mertoatakan.hw3.errormessage;

import com.mertoatakan.hw3.general.BaseErrorMessage;

public enum CityOrCountryNotFoundMessage implements BaseErrorMessage {
    CITY_OR_COUNTRY_NOT_FOUND("Weather forecast not found for the given city and country code");

    private final String message;

    CityOrCountryNotFoundMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
