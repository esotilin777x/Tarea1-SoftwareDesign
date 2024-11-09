/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Boleto.java
public class Boleto {
    private Funcion funcion;
    private Cliente cliente;
    private String codigoBarras;

    public Boleto(Funcion funcion, Cliente cliente, String codigoBarras) {
        this.funcion = funcion;
        this.cliente = cliente;
        this.codigoBarras = codigoBarras;
    }

    public String generarCodigoBarras() {
        return "Código único"; // Lógica para generar código
    }
}
