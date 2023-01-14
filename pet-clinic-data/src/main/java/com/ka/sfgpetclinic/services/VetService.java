package com.ka.sfgpetclinic.services;

import com.ka.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
