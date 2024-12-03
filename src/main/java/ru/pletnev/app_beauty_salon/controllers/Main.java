package ru.pletnev.app_beauty_salon.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.pletnev.app_beauty_salon.model.Role;
import ru.pletnev.app_beauty_salon.repository.RoleRepo;

@Controller
@RequiredArgsConstructor
public class Main {

    private final RoleRepo roleRepo;

    @GetMapping
    public String mainPage() {


        Role role = new Role("ROLE_USER");
        Role role2 = new Role("ROLE_MASTER");
        roleRepo.save(role);
        roleRepo.save(role2);

        return "main.html";
    }

}
