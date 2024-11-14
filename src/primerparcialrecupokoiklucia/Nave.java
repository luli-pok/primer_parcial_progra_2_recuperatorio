
package primerparcialrecupokoiklucia;

import java.util.Objects;


abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    } 

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        /*if (obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        Auto a = (Auto) obj;*/
        if(obj instanceof String str){
            return str.equals(nombre);
        }
        if(obj instanceof Nave nave){
            return anioLanzamiento == nave.anioLanzamiento && Objects.equals(nombre, nave.nombre);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(nombre,anioLanzamiento);
    }

    public String getDetalles() {
        return "Nombre: " + nombre + ", Capacidad de Tripulación: " + capacidadTripulacion +
               ", Año de Lanzamiento: " + anioLanzamiento;
    }
    
}
