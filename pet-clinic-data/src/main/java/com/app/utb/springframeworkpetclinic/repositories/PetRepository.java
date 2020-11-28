package com.app.utb.springframeworkpetclinic.repositories;

import com.app.utb.springframeworkpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
