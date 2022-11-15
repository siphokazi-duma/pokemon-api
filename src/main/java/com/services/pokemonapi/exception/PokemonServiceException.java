package com.services.pokemonapi.exception;

import org.springframework.http.HttpStatus;

public class PokemonServiceException extends RuntimeException {

    private HttpStatus httpStatus;

    public PokemonServiceException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public PokemonServiceException(String message) {
        super(message);
    }

    public PokemonServiceException(String message, HttpStatus httpStatus, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
