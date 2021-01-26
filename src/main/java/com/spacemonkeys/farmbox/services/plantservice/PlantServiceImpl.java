package com.spacemonkeys.farmbox.services.plantservice;

import com.spacemonkeys.farmbox.Models.Plant;
import com.spacemonkeys.farmbox.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PlantServiceImpl implements PlantService {

    @Autowired
    private final PlantRepository repository;

    public PlantServiceImpl(PlantRepository repository) {
        this.repository = repository;
    }


    @Override
    public Plant save(Plant plant) {
        return repository.save(plant);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Plant update(Long id, Plant plant) {

        Plant updater  =  repository.findById(id)
        .map( up -> {
            up.setType(plant.getType());
            up.setUser(plant.getUser());
            up.setCicle(plant.getCicle());
            up.setAge(plant.getAge());
            //up.setInfo(plant.getInfo());
            Plant data  = repository.save(up);
            return data;
        }).get();

        return updater;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Plant> findById(Long id) {
        return repository.findById(id);
    }
}
