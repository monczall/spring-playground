package dev.monczall.springplayground.exceptions.models;

import java.time.LocalDateTime;

public record ErrorResponseBody(String title, int status, String details, LocalDateTime timestamp) {
}
