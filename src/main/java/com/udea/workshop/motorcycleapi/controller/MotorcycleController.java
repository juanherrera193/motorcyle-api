package com.udea.workshop.motorcycleapi.controller;

import com.udea.workshop.motorcycleapi.controller.request.MotorcycleRequest;
import com.udea.workshop.motorcycleapi.controller.response.MotorcycleResponse;
import com.udea.workshop.motorcycleapi.controller.response.ResponseWrapper;
import com.udea.workshop.motorcycleapi.model.Motorcycle;
import com.udea.workshop.motorcycleapi.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService service;

    @GetMapping
    public ResponseWrapper<List<Motorcycle>> getAllMotorcycles() {
        List<Motorcycle> response = service.getAllMotorcycles();
        return new ResponseWrapper<>(response);
    }

    @GetMapping("/{motorcycleId}")
    public ResponseWrapper<Motorcycle> getMotorcycle(@PathVariable String motorcycleId) {
        Motorcycle response = service.getMotorcycle(motorcycleId);
        return new ResponseWrapper<>(response);
    }

    @PostMapping
    public ResponseWrapper<MotorcycleResponse> saveMotorcycle(@RequestBody MotorcycleRequest request) {
        MotorcycleResponse response = service.saveMotorcycle(request);
        return new ResponseWrapper<>(response);
    }
}
