/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialrecupokoiklucia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AgenciaEspacial {
    private List<Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) throws Exception {
        if (naves.contains(nave)) {
            throw new NaveDuplicadaException();
        }
        if (nave == null) {
            throw new NullPointerException("No se puede agregar un animal nulo.");
        }
        naves.add(nave);;
    }

    public void mostrarNaves() {
        for (Nave nave : naves) {
            System.out.println(nave.getDetalles());
        }
    }

    public void iniciarExploracion() {
        for (Nave nave : naves) {
            if (nave instanceof Exploracion) {
                ((Exploracion) nave).explorar();
            } else {
                System.out.println(nave.getNombre() + " no puede iniciar una misión de exploración, solo transporta pasajeros.");
            }
        }
    }
}
