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
    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(value = {PokemonServiceException.class})
    protected ResponseEntity<Object> handleValidation(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(bodyOfResponse);
        errorResponse.setStatus(BigDecimal.valueOf(HttpStatus.PRECONDITION_FAILED.value()));
        errorResponse.setError(HttpStatus.PRECONDITION_FAILED.getReasonPhrase());
        return handleExceptionInternal(ex, errorResponse,
                new HttpHeaders(), HttpStatus.PRECONDITION_FAILED, request);
    }

    @ExceptionHandler(value = {FeignException.class})
    protected ResponseEntity<Object> handleFeignException(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(bodyOfResponse);
        errorResponse.setStatus(new BigDecimal(HttpStatus.INTERNAL_SERVER_ERROR.value()));
        errorResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return handleExceptionInternal(ex, errorResponse,
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
