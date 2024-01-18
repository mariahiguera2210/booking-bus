package com.company.busbookingapi.controller;

import com.company.busbookingapi.BookingService;
import com.company.busbookingapi.domain.dto.GenericDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class Controller<T> {

    private final BookingService<T, ?> bookingService;

    public Controller(BookingService<T, ?> bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping()
    public ResponseEntity<T> saveBooking(@RequestBody T entity) {
        T savedEntity = bookingService.save(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
}



