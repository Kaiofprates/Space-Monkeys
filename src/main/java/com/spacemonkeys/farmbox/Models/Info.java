package com.spacemonkeys.farmbox.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Float water;
    private Float humidity;
    private Boolean light;
    private String ph;
    private String conductivity;
    private String nutrients;

    @DateTimeFormat
    private String time;

    public Info(String conductivity,
                Float water,
                Float humidity,
                Boolean light,
                String ph,
                String conductivity1,
                String nutrients) {
    }
}
