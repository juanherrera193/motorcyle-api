package com.udea.workshop.motorcycleapi.repository;

import com.udea.workshop.motorcycleapi.model.Motorcycle;
import org.springframework.data.repository.CrudRepository;

public interface MotorcycleRepository extends CrudRepository<Motorcycle, Integer> {

}
