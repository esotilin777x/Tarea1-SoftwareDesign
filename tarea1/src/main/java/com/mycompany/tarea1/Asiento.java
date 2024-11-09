/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Asiento.java (Clase que representa el asiento)
public class Asiento {
    private int numero;
    private TipoAsiento tipoAsiento;
    private boolean estado; // true para ocupado, false para disponible

    public Asiento(int numero, TipoAsiento tipoAsiento) {
        this.numero = numero;
        this.tipoAsiento = tipoAsiento;
        this.estado = false;
    }

    public void reservar() {
        this.estado = true;
    }

    public void liberar() {
        this.estado = false;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
}