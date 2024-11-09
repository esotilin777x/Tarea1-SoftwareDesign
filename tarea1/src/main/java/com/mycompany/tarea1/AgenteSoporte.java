/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// AgenteSoporte.java
public class AgenteSoporte extends Usuario {

    public AgenteSoporte(String nombre, String email, String contraseña) {
        super(nombre, email, contraseña);
    }

    public void atenderReclamo(Problema problema) {
        problema.actualizarEstado(EstadoProblema.EN_PROCESO);
    }
}