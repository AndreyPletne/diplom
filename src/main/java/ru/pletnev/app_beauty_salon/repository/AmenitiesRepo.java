package ru.pletnev.app_beauty_salon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pletnev.app_beauty_salon.model.Amenities;


import java.util.Optional;

public interface AmenitiesRepo extends JpaRepository<Amenities, Long> {

    Optional<Amenities> findByName(String name);
}
