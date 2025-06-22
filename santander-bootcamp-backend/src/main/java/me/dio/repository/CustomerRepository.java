package me.dio.repository;
import me.dio.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
