package com.company.busbookingapi.domain.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record BookingMongoDto(
        String name,
        String email,
        String origin,
        String destination,
        LocalDate departureDate,
        LocalTime departureTime,
        String duration
) {
}
