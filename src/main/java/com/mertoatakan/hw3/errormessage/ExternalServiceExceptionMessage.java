package com.mertoatakan.hw3.errormessage;

import com.mertoatakan.hw3.general.BaseErrorMessage;

public enum ExternalServiceExceptionMessage implements BaseErrorMessage {
    FAILED_TO_RETRIEVE("Failed to retrieve weather forecast from the external service");

    private final String message;

    ExternalServiceExceptionMessage(String message) {
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
