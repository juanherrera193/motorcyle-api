package com.udea.workshop.motorcycleapi.controller;

import com.udea.workshop.motorcycleapi.controller.request.MotorcycleRequest;
import com.udea.workshop.motorcycleapi.controller.response.MotorcycleResponse;
import com.udea.workshop.motorcycleapi.model.Motorcycle;
import com.udea.workshop.motorcycleapi.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService service;

    @GetMapping
    public List<Motorcycle> getAllMotorcycles() {
        return service.getAllMotorcycles();
    }

    @GetMapping("/{motorcycleId}")
    public Motorcycle getMotorcycle(@PathVariable String motorcycleId) {
        return service.getMotorcycle(motorcycleId);
    }

    @PostMapping
    public MotorcycleResponse saveMotorcycle(@RequestBody MotorcycleRequest request) {
        return service.saveMotorcycle(request);
    }
}
