package ru.pletnev.app_beauty_salon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.User;
import ru.pletnev.app_beauty_salon.repository.UserRepo;
import ru.pletnev.app_beauty_salon.service.interfaces.UserService;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;


    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Collection<User> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User update(Long id, User user) {
        return null;
    }
}
