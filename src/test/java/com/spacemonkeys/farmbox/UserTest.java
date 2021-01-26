package com.spacemonkeys.farmbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spacemonkeys.farmbox.Models.Plant;
import com.spacemonkeys.farmbox.Models.Users;
import com.spacemonkeys.farmbox.repository.PlantRepository;
import com.spacemonkeys.farmbox.repository.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@AutoConfigureMockMvc

public class UserTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PlantRepository plantRepository;

    @Test
    public void setUserTest() throws Exception {

        Users user = new Users();
        user.setName("John Doe");
        user.setPassword("password");

        Users usertest = usersRepository.save(user);
        Long id  = usertest.getId();

        Plant plant  = new Plant();
        plant.setAge(3L);
        plant.setUser(id);
        plant.setCicle("Trimestral");
        plant.setType("vegetable");

        Plant plantTest = plantRepository.save(plant);

        List<Plant> plantas  = new ArrayList<Plant>();
        plantas.add(plant);

        user.setPlants(plantas);
        Users user2 = usersRepository.save(user);


        String result = new ObjectMapper().writeValueAsString(plantTest);
        System.out.println(result);
        System.out.println(new ObjectMapper().writeValueAsString(user2));

    }
}
