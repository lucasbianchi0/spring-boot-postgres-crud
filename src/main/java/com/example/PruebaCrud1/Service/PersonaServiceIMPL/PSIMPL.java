package com.example.PruebaCrud1.Service.PersonaServiceIMPL;

import com.example.PruebaCrud1.Entity.Persona;
import com.example.PruebaCrud1.Repository.PersonaRepo;
import com.example.PruebaCrud1.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService {

    @Autowired
    private PersonaRepo repo;
    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
