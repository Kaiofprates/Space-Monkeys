package com.spacemonkeys.farmbox.controllers;

import com.spacemonkeys.farmbox.Models.Plant;
import com.spacemonkeys.farmbox.dto.PlantDto;
import com.spacemonkeys.farmbox.services.plantservice.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping({"/plant"})
public class PlantController {
    @Autowired
    private final PlantService plantService;


    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    public List getAll(){
        return plantService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plant create (@RequestBody @Valid PlantDto dto){
        return plantService.save(dto.dtoToPlant());
    }


}
