/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialrecupokoiklucia;

/**
 *
 * @author Usuario
 */
public class PrimerParcialRecuPokoikLucia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            AgenciaEspacial agencia = new AgenciaEspacial();

            Nave exploracion1 = new NaveExploracion("Explorador Alpha", 5, 2025, Mision.INVESTIGACIÓN);
            Nave carguero1 = new Carguero("Galáctica", 10, 2023, 300);
            Nave crucero1 = new CruceroEstelar("Estrella de Luz", 200, 2022, 1000);

            agencia.agregarNave(exploracion1);
            agencia.agregarNave(carguero1);
            agencia.agregarNave(crucero1);

            System.out.println("Listado de naves:");
            agencia.mostrarNaves();

            System.out.println("\nIniciando exploración:");
            agencia.iniciarExploracion();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
