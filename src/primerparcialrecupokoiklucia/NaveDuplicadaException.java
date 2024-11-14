/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialrecupokoiklucia;

/**
 *
 * @author Usuario
 */
public class NaveDuplicadaException extends RuntimeException{
    private final static String MENSAJE = "Nave repetida";

    public NaveDuplicadaException() {
        super(MENSAJE);
    }
    
    
}
