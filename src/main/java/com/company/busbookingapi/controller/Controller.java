package com.company.busbookingapi.controller;

import com.company.busbookingapi.BookingService;
import com.company.busbookingapi.domain.dto.BookingDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class Controller {

    private final BookingService<BookingDto> bookingService;

    public Controller(BookingService<BookingDto> bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping()
   public ResponseEntity<?> saveBooking(@RequestBody  BookingDto bookingDto) {
        bookingService.save(bookingDto);
       return new ResponseEntity<>("guardado", HttpStatus.CREATED);
   }
}



