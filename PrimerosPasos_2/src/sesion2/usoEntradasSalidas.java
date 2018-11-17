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
public class usoEntradasSalidas {
    public static void main(String[] args) {
        String entrada;
        entrada = JOptionPane.showInputDialog("Intruduce un texto");
        
        System.out.println("el texto introducido fue " + entrada);
    }
    
}
