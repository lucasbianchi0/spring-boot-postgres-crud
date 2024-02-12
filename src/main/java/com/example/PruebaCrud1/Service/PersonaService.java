package com.example.PruebaCrud1.Service;

import com.example.PruebaCrud1.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> consultarPersona();
    public Persona crearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona buscarPersona(int id);
    public void eliminarPersona(int id);

}
