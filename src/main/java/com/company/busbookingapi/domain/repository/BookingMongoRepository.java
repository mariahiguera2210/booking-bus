package com.company.busbookingapi.domain.repository;

import com.company.busbookingapi.domain.entity.BookingMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingMongoRepository extends MongoRepository<BookingMongo, String> {

}
