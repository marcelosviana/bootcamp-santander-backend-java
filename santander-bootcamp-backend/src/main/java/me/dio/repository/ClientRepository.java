package me.dio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.Client;
import org.springframework.stereotype.Repository;

//@org.springframework.stereotype.Repository
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    boolean existsByClientId(String clientId);


}
