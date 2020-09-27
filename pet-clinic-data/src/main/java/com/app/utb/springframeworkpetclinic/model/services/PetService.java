package com.app.utb.springframeworkpetclinic.model.services;

import com.app.utb.springframeworkpetclinic.model.Owner;
import com.app.utb.springframeworkpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);
    Set<Pet> findAll();

}