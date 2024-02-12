package com.example.PruebaCrud1.Repository;

import com.example.PruebaCrud1.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona, Integer > {
}
