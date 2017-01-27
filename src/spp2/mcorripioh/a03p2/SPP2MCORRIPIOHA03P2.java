/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a03p2;

import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2MCORRIPIOHA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        double coseno;
        double seno;
        double tangente;
        double angulo;
        
         //Ejecución del programa
        System.out.println("Introduce angulo: ");
        angulo = keyboard.nextDouble();
        coseno = Math.cos(angulo);
        
        
         //Mostramos resultado
          System.out.println("El seno del ángulo es: " + coseno);
    }
    
}
