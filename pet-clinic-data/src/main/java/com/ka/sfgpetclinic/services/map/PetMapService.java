package com.ka.sfgpetclinic.services.map;

import com.ka.sfgpetclinic.model.Pet;
import com.ka.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService{

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
