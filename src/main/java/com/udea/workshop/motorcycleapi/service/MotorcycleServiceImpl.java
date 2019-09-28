package com.udea.workshop.motorcycleapi.service;

import com.udea.workshop.motorcycleapi.controller.request.MotorcycleRequest;
import com.udea.workshop.motorcycleapi.controller.response.MotorcycleResponse;
import com.udea.workshop.motorcycleapi.exception.NotFoundException;
import com.udea.workshop.motorcycleapi.model.Motorcycle;
import com.udea.workshop.motorcycleapi.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    @Autowired
    private MotorcycleRepository repository;

    @Override
    public List<Motorcycle> getAllMotorcycles() {
        List<Motorcycle> motorcycleList = new ArrayList<>();
        repository.findAll().forEach(motorcycleList::add);

        return motorcycleList;
    }

    @Override
    public Motorcycle getMotorcycle(String motorcycleId) {
        Optional<Motorcycle> optionalMotorcycle = repository.findById(Integer.parseInt(motorcycleId));
        if (!optionalMotorcycle.isPresent()) {
            throw new NotFoundException("Motorcycle id not found");
        }
        return optionalMotorcycle.get();
    }

    @Override
    public MotorcycleResponse saveMotorcycle(MotorcycleRequest request) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand(request.getBrand());
        motorcycle.setMileage(request.getMileage());
        motorcycle.setDescription(request.getDescription());
        motorcycle.setReference(request.getReference());
        motorcycle.setSubcategory(request.getSubcategory());
        motorcycle.setPhotoUrl(request.getPhotoUrl());

        motorcycle = repository.save(motorcycle);

        return new MotorcycleResponse(motorcycle.getId());
    }
}
