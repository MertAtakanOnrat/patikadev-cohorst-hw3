package com.mertoatakan.hw3.exception;

import com.mertoatakan.hw3.general.BaseErrorMessage;
import com.mertoatakan.hw3.general.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BusinessException {
    public NotFoundException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}
