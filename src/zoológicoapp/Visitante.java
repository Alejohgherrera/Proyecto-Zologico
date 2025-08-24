/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoológicoapp;

/**
 *
 * @author ad
 */
public class Visitante {
    
    private String nombre;
    private int edad;
    private String actividad;

    public Visitante(String nombre, int edad, String actividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.actividad = actividad;
    }

    public String getnombre() {
        return nombre;
    }

    public int getedad() {
        return edad;
    }

    public String getactividad() {
        return actividad;
    }

    
    public void mostrarInfoCompleta() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Actividad: " + this.actividad);
    }
}
