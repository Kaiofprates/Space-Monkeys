package com.spacemonkeys.farmbox.dto;

import com.spacemonkeys.farmbox.Models.Plant;
import com.spacemonkeys.farmbox.Models.Users;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    public String name;
    public String password;
    public Users toUser(){
        return new Users(this.name,this.password);
    }
}
