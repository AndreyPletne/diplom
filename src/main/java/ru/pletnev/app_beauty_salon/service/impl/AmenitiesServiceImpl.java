package ru.pletnev.app_beauty_salon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.Amenities;
import ru.pletnev.app_beauty_salon.repository.AmenitiesRepo;
import ru.pletnev.app_beauty_salon.service.interfaces.AmenitiesService;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AmenitiesServiceImpl implements AmenitiesService {

    private final AmenitiesRepo amenitiesRepo;

    @Override
    public Amenities save(Amenities amenities) {
        return null;
    }

    @Override
    public Amenities findByName(String name) {
        return null;
    }

    @Override
    public Amenities findById(Long id) {
        return null;
    }

    @Override
    public Collection<Amenities> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void delete(Amenities amenities) {

    }

    @Override
    public Amenities update(Long id, Amenities amenities) {
        return null;
    }
}
