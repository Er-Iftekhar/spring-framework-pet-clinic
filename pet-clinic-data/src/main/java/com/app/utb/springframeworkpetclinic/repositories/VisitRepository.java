package com.app.utb.springframeworkpetclinic.repositories;

import com.app.utb.springframeworkpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
