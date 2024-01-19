package com.company.busbookingapi.service;

import com.company.busbookingapi.BookingService;
import com.company.busbookingapi.domain.dto.BookingDto;
import com.company.busbookingapi.domain.entity.BookingMongo;
import com.company.busbookingapi.domain.repository.BookingMongoRepository;
import com.company.busbookingapi.mapper.BookingMapperMongo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceMongo implements BookingService<BookingDto>{

    private final BookingMongoRepository bookingMongoRepository;
    private final BookingMapperMongo mapper;

    public BookingServiceMongo(BookingMongoRepository bookingMongoRepository, BookingMapperMongo mapper) {
        this.bookingMongoRepository = bookingMongoRepository;
        this.mapper = mapper;
    }


    @Override
    public void save(BookingDto dto) {
        BookingMongo bookingMongo = mapper.toEntity(dto);
        bookingMongoRepository.save(bookingMongo);
    }

    @Override
    public BookingDto findById(Object id) throws Exception {
        BookingMongo bookingMongo = bookingMongoRepository.findById(id.toString())
                .orElseThrow(() -> new Exception("Data not found"));
        return mapper.toDto(bookingMongo);

    }
    @Override
    public List<BookingDto> findAll() {
        List<BookingMongo> bookings = bookingMongoRepository.findAll();
        return mapper.toDtoList(bookings);
    }

    @Override
    public void delete(Object id) {
        bookingMongoRepository.deleteById(id.toString());

    }
}
