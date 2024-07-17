package me.dio.domain.repository;


import org.springframework.boot.autoconfigure.security.SecurityProperties;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import me.dio.domain.model.Cliente;

@Repository
public interface UserRepository extends JpaRepository<Cliente,Long> {
}
