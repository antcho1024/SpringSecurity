package com.sparta.week02_1_login3.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class RestApiException {
    private String errorMessage;
    private HttpStatus httpStatus;
}