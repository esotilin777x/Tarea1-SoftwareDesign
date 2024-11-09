/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// VIPSeat.java (Implementación de TipoAsiento)
public class VIPSeat implements TipoAsiento {
    @Override
    public double getPrecio() {
        return 20.0; // Precio VIP
    }

    @Override
    public String getDescripcion() {
        return "Asiento VIP";
    }
}
