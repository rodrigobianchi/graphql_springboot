package io.github.bianchi.repository;

import io.github.bianchi.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRespository extends JpaRepository<Pet, Long> {
}
