package ru.pletnev.app_beauty_salon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pletnev.app_beauty_salon.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
}
