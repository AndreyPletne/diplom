package ru.pletnev.app_beauty_salon;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.pletnev.app_beauty_salon.model.Role;
import ru.pletnev.app_beauty_salon.repository.RoleRepo;

@SpringBootApplication
public class AppBeautySalonApplication {


    public static void main(String[] args) {
        SpringApplication.run(AppBeautySalonApplication.class, args);


    }

}
