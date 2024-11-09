/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Sala.java
import java.util.List;

public class Sala {
    private int numeroSala;
    private List<Asiento> asientos;

    public Sala(int numeroSala, List<Asiento> asientos) {
        this.numeroSala = numeroSala;
        this.asientos = asientos;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }
}
