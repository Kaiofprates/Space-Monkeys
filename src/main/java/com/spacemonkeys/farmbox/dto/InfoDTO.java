package com.spacemonkeys.farmbox.dto;

import com.spacemonkeys.farmbox.Models.Info;
import com.sun.istack.NotNull;
import jdk.jfr.BooleanFlag;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class InfoDTO {

    @NotNull
    public Float water;

    @NotNull
    public Float humidity;

    @BooleanFlag
    public Boolean light;
    @NotBlank
    public String ph;
    @NotBlank
    public String conductivity;
    @NotBlank
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
                this.nutrients
                );
        return info;
    }

    public Float getWater() {
        return water;
    }

    public void setWater(Float water) {
        this.water = water;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Boolean getLight() {
        return light;
    }

    public void setLight(Boolean light) {
        this.light = light;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getConductivity() {
        return conductivity;
    }

    public void setConductivity(String conductivity) {
        this.conductivity = conductivity;
    }

    public String getNutrients() {
        return nutrients;
    }

    public void setNutrients(String nutrients) {
        this.nutrients = nutrients;
    }
}
