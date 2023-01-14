package com.ka.sfgpetclinic.services;

import com.ka.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
