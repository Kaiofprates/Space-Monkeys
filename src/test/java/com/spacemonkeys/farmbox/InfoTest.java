package com.spacemonkeys.farmbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spacemonkeys.farmbox.dto.InfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

@SpringBootTest
@AutoConfigureMockMvc

public class InfoTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createInfoTest() throws Exception {

        Date d = new Date();

        InfoDTO dtoTest = new InfoDTO();
        dtoTest.setConductivity("Medium");
        dtoTest.setHumidity(0.5F);
        dtoTest.setLight(Boolean.TRUE);
        dtoTest.setNutrients("NPFK");
        dtoTest.setTime(String.valueOf(d.getTime()));
        dtoTest.setPh("Medium");
        dtoTest.setWater(0.3F);

        mockMvc.perform(MockMvcRequestBuilders.post("/farmbox")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(dtoTest))
        ).andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(MockMvcResultHandlers.print());
    }
}
