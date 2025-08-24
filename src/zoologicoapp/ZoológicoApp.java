package zoologicoapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;


public class ZoológicoApp {

    public static void main(String[] args) {
        ParqueNatural p = new ParqueNatural();
        int opc = 0;

        do {
            String menu = " Menú de Administración del Parque Natural \n" +
                          "1. Registrar un visitante.\n" +
                          "2. Mostrar todos los visitantes.\n" +
                          "3. Buscar visitantes por actividad.\n" +
                          "4. Salir.\n" +
                          "Seleccione una opción:";
            
            String input = JOptionPane.showInputDialog(menu);
            
            if (input == null) {
                opc = 4;
            } else {
                try {
                    opc = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    opc = -1; // Opción inválida
                }
            }

            switch (opc) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String actividad = JOptionPane.showInputDialog("Actividad:");
                    String edadStr = JOptionPane.showInputDialog("Edad:");
                    int edad = Integer.parseInt(edadStr);
                    
                    Visitante v = new Visitante(nombre, edad, actividad);
                    JOptionPane.showMessageDialog(null, p.registrarVisitante(v));
                    break;
                case 2:
                    p.mostrarTodosLosVisitantes();
                    break;
                case 3:
                    String actividadBuscar = JOptionPane.showInputDialog("Ingrese la actividad a buscar:");
                    p.buscarPorActividad(actividadBuscar);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opc != 4);
    }
}