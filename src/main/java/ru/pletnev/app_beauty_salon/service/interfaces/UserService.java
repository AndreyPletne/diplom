package ru.pletnev.app_beauty_salon.service.interfaces;

import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.User;

import java.util.Collection;
@Service
public interface UserService {

    User save(User user);
    User findByUsername(String username);
    User findById(Long id);
    Collection<User> findAll();
    boolean deleteById(Long id);
    void delete(User user);
    User update(Long id, User user);
}
