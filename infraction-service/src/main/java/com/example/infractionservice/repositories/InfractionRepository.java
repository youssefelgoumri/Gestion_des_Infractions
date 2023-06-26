package com.example.infractionservice.repositories;

import com.example.infractionservice.entites.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {
}
