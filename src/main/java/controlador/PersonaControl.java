/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author User
 */
public class PersonaControl {
    private final PersonaServicio personaServicio = new PersonaServicio();
    
    public Persona crear(String [] params) {
        var fechaNacimiento = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]), 
                Integer.valueOf(params[5]));
      
        var persona = new Persona(Integer.valueOf(params[0]),params[1],
                params[2],fechaNacimiento);
        this.personaServicio.crear(persona);
        return persona;
    }
    
    public List<Persona> listar() {
        return this.personaServicio.listar();
    }

    public Persona getByCodigo(Object i) {
        if((int)i>0)
            return this.personaServicio.getByCodigo((int)i);
        else
            return this.personaServicio.getByCodigo(0);
    }
}
