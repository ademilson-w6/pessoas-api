package com.crud.crudtest.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {EntidadeException.class})
    protected ResponseEntity<Object> entidadeNaoEncontrada(
            EntidadeException ex, WebRequest request) {
        log.error("Erro de entidade: {}", ex.getMessage());
        return handleExceptionInternal(ex, ErrorResponse.builder().message(ex.getMessage()).build(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    protected ResponseEntity<Object> erroValidacao(
            ConstraintViolationException ex, WebRequest request) {
        String message = ex.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(", "));
        log.error("Erro de validação encontrado: {}", message);
        return handleExceptionInternal(ex, ErrorResponse.builder().message(message).build(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<Object> erroGenerico(
            Exception ex, WebRequest request) {
        log.error("Erro genérico encontrado: {}", ex.getMessage());
        return handleExceptionInternal(ex, ErrorResponse.builder().message("Ocorreu um erro interno").build(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }


}
