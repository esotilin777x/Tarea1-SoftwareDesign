/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Seat4D.java (Implementación de TipoAsiento)
public class Seat4D implements TipoAsiento {
    @Override
    public double getPrecio() {
        return 30.0; // Precio para asiento 4D
    }

    @Override
    public String getDescripcion() {
        return "Asiento 4D";
    }
}
