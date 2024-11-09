/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Cliente.java (Extiende Usuario)
import java.util.List;

public class Cliente extends Usuario {
    private List<Boleto> boletos;

    public Cliente(String nombre, String email, String contraseña, List<Boleto> boletos) {
        super(nombre, email, contraseña);
        this.boletos = boletos;
    }

    public void reservarAsiento() {
        // Implementación de reserva
    }

    public void reportarProblema(Problema problema) {
        // Implementación de reporte de problema
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
