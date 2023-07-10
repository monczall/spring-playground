package dev.monczall.springplayground.models.utils;

import java.time.ZonedDateTime;

public class PokemonAuditData {
    private Long createdBy;
    private Long editedBy;
    private ZonedDateTime createdAt;
    private ZonedDateTime editedAt;
}
