package com.project.santandercotacoes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.@org.springframework.web.bind.annotation.ExceptionHandler onHandler(BusinessException.class)
    protected ResponseEntity<ExceptionResponse> handleSecurity(BusinessException ex) {
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse(ex.getMessage()));
    }
}
