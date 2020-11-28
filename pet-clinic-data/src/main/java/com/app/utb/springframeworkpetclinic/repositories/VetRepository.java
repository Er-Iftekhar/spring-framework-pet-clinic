package com.app.utb.springframeworkpetclinic.repositories;

import com.app.utb.springframeworkpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
