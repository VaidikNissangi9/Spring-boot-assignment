package com.shopping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shopping {
    @Id
    private String brand;
    private String type;
    private String description;
    public Shopping(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Shopping(String brand, String type, String description) {
        this.brand = brand;
        this.type = type;
        this.description=description;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }
}
