package ru.pletnev.app_beauty_salon.security;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.pletnev.app_beauty_salon.model.User;
import ru.pletnev.app_beauty_salon.service.interfaces.UserService;


@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
public class SalonUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User with username " + username + " not found");
        }
        SalonUserDetails salonUserDetails = new SalonUserDetails(user);
        return salonUserDetails;
    }
}
