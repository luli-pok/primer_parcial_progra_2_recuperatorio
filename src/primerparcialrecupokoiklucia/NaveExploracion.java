
package primerparcialrecupokoiklucia;

/**
 *
 * @author Usuario
 */
class NaveExploracion extends Nave implements Exploracion {
    private Mision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, Mision tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " está iniciando su misión de " + tipoMision);
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + ", Tipo de Misión: " + tipoMision;
    }
    
}
