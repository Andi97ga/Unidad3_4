/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Persona;

/**
 *
 * @author User
 */
public interface IPersonaServicio {
    public Persona crear(Persona persona);
    public List<Persona> listar();
    public Persona getByCodigo(int i);
}
