package com.services.pokemonapi.exception;

import com.services.pokemonapi.dto.ErrorResponse;
import feign.FeignException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.math.BigDecimal;

@ControllerAdvice(basePackages = "com.services.pokemonapi.controller")
public class PokemonException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {FeignException.class})
    protected ResponseEntity<Object> handleFeignException(
            FeignException feignException, WebRequest request) {
        String bodyOfResponse = feignException.getMessage();
        int statusCode = feignException.status();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMoreInfo(bodyOfResponse);
        errorResponse.setMessage(HttpStatus.valueOf(statusCode).getReasonPhrase());
        errorResponse.setStatus(BigDecimal.valueOf(statusCode));
        errorResponse.setError(HttpStatus.valueOf(statusCode).toString());
        return handleExceptionInternal(feignException, errorResponse,
                new HttpHeaders(), HttpStatus.valueOf(statusCode), request);
    }

    @ExceptionHandler(value = {PokemonServiceException.class})
    protected ResponseEntity<Object> handlePokemonServiceException(
            PokemonServiceException pokemonServiceException, WebRequest request) {
        String bodyOfResponse = pokemonServiceException.getMessage();
        int statusCode = pokemonServiceException.getHttpStatus().value();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMoreInfo(bodyOfResponse);
        errorResponse.setMessage(HttpStatus.valueOf(statusCode).getReasonPhrase());
        errorResponse.setStatus(BigDecimal.valueOf(statusCode));
        errorResponse.setError(HttpStatus.valueOf(statusCode).toString());
        return handleExceptionInternal(pokemonServiceException, errorResponse,
                new HttpHeaders(), HttpStatus.valueOf(statusCode), request);
    }

}
