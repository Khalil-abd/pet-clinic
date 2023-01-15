package com.ka.sfgpetclinic.services.map;

import com.ka.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(T entity){
        if(entity != null){
            if(entity.getId() == null){
                entity.setId(getNextID());
            }
            map.put(entity.getId(), entity);
        }else{
            throw new RuntimeException("Entity cannot be null");
        }
        return entity;
    }

    void deleteById(ID id)
    {
        map.remove(id);
    }

    void delete(T entity){
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    private Long getNextID(){
        Long nextId;
        try{
            nextId = Collections.max(map.keySet()) + 1L;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
