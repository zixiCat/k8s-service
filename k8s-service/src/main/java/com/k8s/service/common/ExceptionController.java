package com.k8s.service.common;

import org.openapitools.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolationException;
import java.util.List;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BindException.class)
    ResponseEntity<List<ErrorDetails>> handleBindException(BindException ex) {
        List<ErrorDetails> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> {
                    ErrorDetails errorDetails = new ErrorDetails();
                    errorDetails.setDetail(fieldError.getDefaultMessage());
                    return errorDetails;
                }).toList();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGenericException(Exception ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setDetail(ex.getMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorDetails);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<List<ErrorDetails>> handleConstraintViolationException(ConstraintViolationException ex) {
        List<ErrorDetails> errors = ex.getConstraintViolations().stream()
                .map(constraintViolation -> {
                    ErrorDetails errorDetails = new ErrorDetails();
                    errorDetails.setDetail(constraintViolation.getMessage());
                    return errorDetails;
                }).toList();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNotFoundException() {
    }
}
