/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author miguel
 */
public class usoString {
    public static void main(String[] args) {
        String nombre = "Miguel";
        String nombre2 = "miguel";
        
        System.out.println("Tu nombre es: " + nombre);
        
        System.out.println("Tu nombre tiene " + nombre.length() 
                + " caracteres");
        
        System.out.println("La letra en la posicion 0 es " + 
                nombre.charAt(0));
        
        String mensaje = "Este es mi primer mensaje";
        String subMensaje = "";
        
        subMensaje = mensaje.substring(2,7);
        
        System.out.println("Mi subcadena es: " + subMensaje);
        
        boolean cadenasIguales;
        
        cadenasIguales = nombre.equals(nombre2);
        
        System.out.println("Resultado del método equals " + cadenasIguales);
        
        cadenasIguales = nombre.equalsIgnoreCase(nombre2);
        
        System.out.println("El resultado del metodo equals Ignore case es: " +
                cadenasIguales);
        
        
        
        
    }
    
}
