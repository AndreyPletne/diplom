package ru.pletnev.app_beauty_salon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.Appointment;
import ru.pletnev.app_beauty_salon.repository.AppointmentRepo;
import ru.pletnev.app_beauty_salon.service.interfaces.AppointmentService;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    @Override
    public Appointment save(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment findById(Long id) {
        return null;
    }

    @Override
    public Collection<Appointment> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void delete(Appointment appointment) {

    }

    @Override
    public Appointment update(Long id, Appointment appointment) {
        return null;
    }
}
