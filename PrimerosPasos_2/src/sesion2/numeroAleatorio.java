/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class numeroAleatorio {
    public static void main(String[] args) {
        
        int aleatorio = (int) (Math.random() * 100);
        int numero = 0;
        
        int intentos = 0;
        
        while( aleatorio != numero){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            
            if (aleatorio > numero){
                System.out.println("Te falta mas");
            }
            
            else if ( aleatorio < numero){
                System.out.println("Te pasaste");
            }
            
            intentos++;
        }
        
        System.out.println("Listo adivinaste el numero fue " + numero);
        System.out.println("Y fue en " + intentos);
    }
    
}
