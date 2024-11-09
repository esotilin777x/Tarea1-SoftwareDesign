/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Problema.java
public class Problema {
    private String descripcion;
    private EstadoProblema estado;

    public Problema(String descripcion) {
        this.descripcion = descripcion;
        this.estado = EstadoProblema.PENDIENTE;
    }

    public void actualizarEstado(EstadoProblema nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
