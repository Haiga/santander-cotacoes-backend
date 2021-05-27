package com.project.santandercotacoes.exceptions;

public class ExceptionResponse {
    private String message;

    public ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
