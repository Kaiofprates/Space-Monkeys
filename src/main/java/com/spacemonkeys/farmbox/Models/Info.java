package com.spacemonkeys.farmbox.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Boolean ligth;
    private String ph;
    private String conductivity;
    private String nutrients;

}
