package com.app.utb.springframeworkpetclinic.model.services;

import com.app.utb.springframeworkpetclinic.model.Owner;
import com.app.utb.springframeworkpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);
    Set<Vet> findAll();
}
