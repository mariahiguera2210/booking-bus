package com.company.busbookingapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.time.LocalTime;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record GenericDto(
        @JsonIgnore(value = true)
        Object id,
        String name,
        String email,
        String origin,
        String destination,
        LocalDate departureDate,
        LocalTime departureTime,
        String duration
) {
}
