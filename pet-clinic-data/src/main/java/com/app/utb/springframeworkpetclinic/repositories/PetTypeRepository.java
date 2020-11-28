package com.app.utb.springframeworkpetclinic.repositories;

import com.app.utb.springframeworkpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
