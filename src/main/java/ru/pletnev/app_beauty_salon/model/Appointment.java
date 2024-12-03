package ru.pletnev.app_beauty_salon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class Appointment extends BaseEntity{


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_appointments",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "appointment_id")
    )
    private Collection<User> users;

    @Column(name = "date_time")
    private DateFormat date;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "appointments_Amenities",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "amenities_id")
    )
    private Collection<Amenities> amenities;





}
