package com.udea.workshop.motorcycleapi.service;

import com.udea.workshop.motorcycleapi.controller.request.MotorcycleRequest;
import com.udea.workshop.motorcycleapi.controller.response.MotorcycleResponse;
import com.udea.workshop.motorcycleapi.model.Motorcycle;

import java.util.List;

public interface MotorcycleService {

    List<Motorcycle> getAllMotorcycles();

    Motorcycle getMotorcycle(String motorcycleId);

    MotorcycleResponse saveMotorcycle(MotorcycleRequest request);
}
