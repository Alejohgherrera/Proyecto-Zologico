/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicoapp;

public class Visitante {
    private String nombre;
    private int edad;
    private String actividadPreferida;

    public Visitante(String nombre, int edad, String actividadPreferida) {
        this.nombre = nombre;
        this.edad = edad;
        this.actividadPreferida = actividadPreferida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getActividadPreferida() {
        return actividadPreferida;
    }

    public void mostrarInfoCompleta() {
        System.out.println("--- Información del Visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Actividad Preferida: " + actividadPreferida);
        System.out.println("---------------------------------");
    }
}

   

    
    
    
