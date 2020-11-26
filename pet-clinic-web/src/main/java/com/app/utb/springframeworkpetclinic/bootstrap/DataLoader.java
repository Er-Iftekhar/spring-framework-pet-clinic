package com.app.utb.springframeworkpetclinic.bootstrap;


import com.app.utb.springframeworkpetclinic.model.*;
import com.app.utb.springframeworkpetclinic.services.OwnerService;
import com.app.utb.springframeworkpetclinic.services.PetTypeService;
import com.app.utb.springframeworkpetclinic.services.SpecialityService;
import com.app.utb.springframeworkpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class  DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService,
                      SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0){
            loadData();
        }


    }

    private void loadData() {
        //PetType1 saved
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);


        //PetType2 saved
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        //Speciality1 saved
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        //Speciality2 saved
        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        //Speciality3 saved
        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("12345678910");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setOwner(owner1);
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("12345678910");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just cat");
        fionasCat.setOwner(owner2);
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);
        System.out.println("Loaded Owners");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
