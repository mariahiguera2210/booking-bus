package com.company.busbookingapi.domain.repository;

import com.company.busbookingapi.domain.entity.BookingPostgres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingPostgresRepository extends JpaRepository<BookingPostgres, Integer> {
}