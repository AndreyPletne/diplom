package ru.pletnev.app_beauty_salon.service.interfaces;

import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.Amenities;
import ru.pletnev.app_beauty_salon.model.User;

import java.util.Collection;

@Service
public interface AmenitiesService {

    Amenities save(Amenities amenities);
    Amenities findByName(String name);
    Amenities findById(Long id);
    Collection<Amenities> findAll();
    boolean deleteById(Long id);
    void delete(Amenities amenities);
    Amenities update(Long id, Amenities amenities);
}
