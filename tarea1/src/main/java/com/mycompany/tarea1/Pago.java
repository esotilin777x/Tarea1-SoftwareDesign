/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Pago.java
public class Pago {
    private double monto;
    private Cliente cliente;
    private boolean estado;

    public Pago(double monto, Cliente cliente) {
        this.monto = monto;
        this.cliente = cliente;
        this.estado = false;
    }

    public boolean procesarPago() {
        // Implementa la lógica de procesamiento
        estado = true; // Suponiendo que el pago fue exitoso
        System.out.println("Pago procesado para el cliente " + cliente.getNombre());
        return estado;
    }
}
