/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Capitan;

/**
 *
 * @author User
 */
public interface ICapitanServicio {
    public Capitan crear(Capitan capitan);
    public List<Capitan> listar();
}
