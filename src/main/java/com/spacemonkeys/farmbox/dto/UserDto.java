package com.spacemonkeys.farmbox.dto;

import com.spacemonkeys.farmbox.Models.Plant;
import com.spacemonkeys.farmbox.Models.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    public String name;
    public String password;
    public List<Plant> plants;

    public Users toUser(){
        return new Users(this.name,this.password, this.plants);
    }
}
