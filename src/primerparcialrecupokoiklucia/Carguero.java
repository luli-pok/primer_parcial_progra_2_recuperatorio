/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialrecupokoiklucia;


class Carguero extends Nave implements Exploracion {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if (capacidadCarga < 100 || capacidadCarga > 500) {
            throw new IllegalArgumentException("La capacidad de carga debe estar entre 100 y 500 toneladas.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " está transportando carga de " + capacidadCarga + " toneladas en misión.");
    }  
    @Override
    public String getDetalles() {
        return super.getDetalles() + ", Capacidad de Carga: " + capacidadCarga + " toneladas";
    }
}
