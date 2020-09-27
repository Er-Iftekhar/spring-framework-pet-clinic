package com.app.utb.springframeworkpetclinic.model.services;

import com.app.utb.springframeworkpetclinic.model.Owner;
import java.util.Set;
public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);
    Set<Owner> findAll();
}
