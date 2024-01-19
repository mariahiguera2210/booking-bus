package com.company.busbookingapi.service;

import com.company.busbookingapi.BookingService;
import com.company.busbookingapi.domain.entity.BookingPostgres;
import com.company.busbookingapi.domain.repository.BookingPostgresRepository;
import com.company.busbookingapi.mapper.BookingMapperPostgres;
import org.springframework.stereotype.Service;
import com.company.busbookingapi.domain.dto.BookingDto;

import java.util.List;

@Service
public class BookingServicePostgres implements BookingService<BookingDto> {
    private final BookingPostgresRepository bookingPostgresRepository;
    private final BookingMapperPostgres mapper;

    public BookingServicePostgres(BookingPostgresRepository bookingPostgresRepository, BookingMapperPostgres mapper) {
        this.bookingPostgresRepository = bookingPostgresRepository;
        this.mapper = mapper;
    }

    @Override
    public void save(BookingDto dto) {
        BookingPostgres bookingPostgres = mapper.toEntity(dto);
        bookingPostgresRepository.save(bookingPostgres);

    }

    @Override
    public BookingDto findById(Object id) throws Exception {
        BookingPostgres bookingPostgres = bookingPostgresRepository.findById(Integer.valueOf(id.toString()))
                .orElseThrow(() -> new Exception("Data not found"));
        return mapper.toDto(bookingPostgres);
    }

    @Override
    public List<BookingDto> findAll() {
        List<BookingPostgres> bookings = bookingPostgresRepository.findAll();
        return mapper.toDtoList(bookings);
    }

    @Override
    public void delete(Object id) {
        bookingPostgresRepository.deleteById(Integer.valueOf(id.toString()));

    }
}
