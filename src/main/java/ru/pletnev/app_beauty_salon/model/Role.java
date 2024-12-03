package ru.pletnev.app_beauty_salon.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role extends BaseEntity{


    @Column(nullable = false, name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<User> users;

    public Role(String name) {
        this.name = name;
    }
}
