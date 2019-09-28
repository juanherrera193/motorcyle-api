package com.udea.workshop.motorcycleapi.controller.request;

import lombok.Data;

@Data
public class MotorcycleRequest {
    private String brand;
    private String reference;
    private String mileage;
    private String subcategory;
    private String photoUrl;
    private String description;
}
