package ru.pletnev.app_beauty_salon.service.interfaces;

import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.Appointment;
import ru.pletnev.app_beauty_salon.model.User;

import java.util.Collection;


@Service
public interface AppointmentService {


    Appointment save(Appointment appointment);
    Appointment findById(Long id);
    Collection<Appointment> findAll();
    boolean deleteById(Long id);
    void delete(Appointment appointment);
    Appointment update(Long id, Appointment appointment);
}
