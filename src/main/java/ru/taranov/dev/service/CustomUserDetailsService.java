package ru.taranov.dev.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.taranov.dev.entity.UserEntity;
import ru.taranov.dev.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        if (username.equals("admin")) {
            return User.builder()
                    .username("admin")
                    .password("admin")
                    .roles("USER")
                    .build();
        }
        throw new UsernameNotFoundException("User not found");
    }

}

