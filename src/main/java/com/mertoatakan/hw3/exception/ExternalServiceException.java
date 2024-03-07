package com.mertoatakan.hw3.exception;

import com.mertoatakan.hw3.general.BaseErrorMessage;
import com.mertoatakan.hw3.general.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ExternalServiceException extends BusinessException {
    public ExternalServiceException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}
