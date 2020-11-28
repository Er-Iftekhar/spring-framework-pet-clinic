package com.app.utb.springframeworkpetclinic.services.springdatajpa;

import com.app.utb.springframeworkpetclinic.model.Vet;
import com.app.utb.springframeworkpetclinic.repositories.PetRepository;
import com.app.utb.springframeworkpetclinic.repositories.VetRepository;
import com.app.utb.springframeworkpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Profile("springdatajpa")
public class VetsSDJpaService implements VetService {

    private final VetRepository vetRepository;
    private final PetRepository petRepository;

    public VetsSDJpaService(VetRepository vetRepository, PetRepository petRepository) {
        this.vetRepository = vetRepository;
        this.petRepository = petRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
