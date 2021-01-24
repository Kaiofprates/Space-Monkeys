package com.spacemonkeys.farmbox.dto;

import com.spacemonkeys.farmbox.Models.Info;
import jdk.jfr.BooleanFlag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@Setter
public class InfoDTO {

    public Float water;

    public Float humidity;

    @BooleanFlag
    public Boolean light;

    public String ph;

    public String conductivity;

    public String nutrients;

    @DateTimeFormat
    private String time;

    public Info toInfo(){
        Info info = new Info(
                this.conductivity,
                this.water,
                this.humidity,
                this.light,
                this.ph,
                this.conductivity,
                this.nutrients);
        return info;
    }
}
