package com.ka.sfgpetclinic.services.map;

import com.ka.sfgpetclinic.model.Owner;
import com.ka.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long>{

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Owner entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
