/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author erick
 */
// Notificacion.java
public class Notificacion implements ServicioNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Cliente cliente) {
        // Aquí iría la lógica para enviar la notificación
        System.out.println("Enviando notificación a " + cliente.getNombre() + ": " + mensaje);
    }
}

