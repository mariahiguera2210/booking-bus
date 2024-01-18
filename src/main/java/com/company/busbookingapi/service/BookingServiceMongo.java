package com.company.busbookingapi.service;

import com.company.busbookingapi.BookingService;
import com.company.busbookingapi.domain.dto.BookingMongoDto;
import com.company.busbookingapi.domain.dto.GenericDto;
import com.company.busbookingapi.domain.entity.BookingMongo;
import com.company.busbookingapi.domain.repository.BookingMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceMongo implements BookingService<BookingMongo, String>{

    @Autowired
    private final BookingMongoRepository bookingMongoRepository;

    public BookingServiceMongo(BookingMongoRepository bookingMongoRepository) {
        this.bookingMongoRepository = bookingMongoRepository;
    }

    @Override
    public BookingMongo save(BookingMongo entity) {
        return bookingMongoRepository.save(entity);
    }

    @Override
    public Optional<BookingMongo> findById(String id) {
        return bookingMongoRepository.findById(id);

    }

    @Override
    public List<BookingMongo> findAll() {
        return bookingMongoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
         bookingMongoRepository.deleteById(id);

    }

    @Override
    public void delete(BookingMongo entity) {

    }


}
