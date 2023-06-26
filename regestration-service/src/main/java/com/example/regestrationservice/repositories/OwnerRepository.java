package com.example.regestrationservice.repositories;

import com.example.regestrationservice.entites.Owner;
import com.example.regestrationservice.entites.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
