/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package zoologicoapp;

public class ParqueNatural {

    public Visitante v[] = new Visitante[10];
    private int pos = 0;

    public String registrarVisitante(Visitante visita) {
        if (pos < v.length) {
            v[pos] = visita;
            pos++;
            return "Visitante registrado con éxito.";
        } else {
            return "No se pueden registrar más visitantes, el parque está lleno.";
        }
    }

    public void mostrarTodosLosVisitantes() {
        if (pos == 0) {
            System.out.println("No hay visitantes registrados en el parque.");
            return;
        }
        System.out.println("--- Lista de Todos los Visitantes ---");
        for (int i = 0; i < pos; i++) {
            System.out.println("- " + v[i].getNombre());
        }
        System.out.println("-------------------------------------");
    }

    public void buscarPorActividad(String actividad) {
        boolean encontrado = false;
        System.out.println("--- Visitantes que prefieren '" + actividad + "' ---");
        for (int i = 0; i < pos; i++) {
            if (v[i].getActividadPreferida().equalsIgnoreCase(actividad)) {
                v[i].mostrarInfoCompleta();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron visitantes que prefieran esa actividad.");
        }
        System.out.println("--------------------------------------------");
    }
}
