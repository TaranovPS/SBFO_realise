package ru.taranov.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.taranov.dev.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}

