/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// StandardSeat.java (Implementación de TipoAsiento)
public class StandardSeat implements TipoAsiento {
    @Override
    public double getPrecio() {
        return 10.0; // Precio estándar
    }

    @Override
    public String getDescripcion() {
        return "Asiento estándar";
    }
}