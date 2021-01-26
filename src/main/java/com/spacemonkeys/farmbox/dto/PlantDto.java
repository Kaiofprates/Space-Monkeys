package com.spacemonkeys.farmbox.dto;

import com.spacemonkeys.farmbox.Models.Info;
import com.spacemonkeys.farmbox.Models.Plant;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlantDto {
    public String type;
    public Long age;
    public String cicle;
    public Long user;

    public Plant dtoToPlant(){
        Plant data  = new Plant(this.type,this.age,this.cicle,this.user);
        return data;
    }
}
