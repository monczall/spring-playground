package dev.monczall.springplayground.models.utils;

import java.time.ZonedDateTime;

public class UserAuditData {
    private Long createdBy;
    private Long editedBy;
    private ZonedDateTime createdAt;
    private ZonedDateTime editedAt;
    private ZonedDateTime lastLogin;
}
