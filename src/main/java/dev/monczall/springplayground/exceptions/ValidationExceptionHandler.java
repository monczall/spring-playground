package dev.monczall.springplayground.exceptions;

import dev.monczall.springplayground.exceptions.models.ErrorResponseBody;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;

@ControllerAdvice
public class ValidationExceptionHandler {

    private MessageSource messageSource;
    private final HttpStatus BAD_REQUEST = HttpStatus.BAD_REQUEST;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorResponseBody> handleValidationException(MethodArgumentNotValidException exception) {
        var responseBody = new ErrorResponseBody("Incorrect data provided", BAD_REQUEST.value(),
                Arrays.stream(exception.getDetailMessageArguments(messageSource, Locale.forLanguageTag("pl"))).toList().toString(), LocalDateTime.now());

        return ResponseEntity.status(BAD_REQUEST)
                .body(responseBody);
    }
}
